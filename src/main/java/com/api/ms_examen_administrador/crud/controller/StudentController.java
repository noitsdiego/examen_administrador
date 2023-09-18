package com.api.ms_examen_administrador.crud.controller;

import com.api.ms_examen_administrador.crud.models.AssignmentModel;
import com.api.ms_examen_administrador.crud.models.ExamModel;
import com.api.ms_examen_administrador.crud.models.StudentModel;
import com.api.ms_examen_administrador.crud.services.AssignmentService;
import com.api.ms_examen_administrador.crud.services.ExamService;
import com.api.ms_examen_administrador.crud.services.QuestionService;
import com.api.ms_examen_administrador.crud.services.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


@RestController
@RequestMapping("/student")
/**
 * Clase controller para el estudiante
 * @author Diego Andres Riveros Lopez
 */
public class StudentController {

    @Autowired
    /*
     * Inyeccion de dependencias para el estudiante
     */
    private StudentService studentService;

    @Autowired
    /*
     * Inyeccion de dependencias para el examen
     */
    private ExamService examService;

    @Autowired
    /*
     * Inyeccion de dependencias las preguntas
     */
    private QuestionService questionService;

    @Autowired
    /*
     * Inyeccion de dependencias para el asignamiento
     */
    private AssignmentService assignmentService;


    /*
     * Devuelve todos los estudiantes
     */
    @GetMapping(path = "/getAll")
    public ArrayList<StudentModel> getStudent() {
        return this.studentService.getStudents();
    }

    /*
     * Agrega un nuevo estudiante
     */
    @PostMapping(path = "/add")
    public String addStudent(@RequestBody StudentModel student) {
        student.setNit_Exam(createExam(student, createAssignment(student)));
        student.setZoneTime(String.valueOf(ZonedDateTime.now().getZone()));
        this.studentService.addStudent(student);
        return getAssigment(student);
    }


    /*
     * Crea un examen por estudiante
     */
    public String createExam(StudentModel student, int nit_assignment) {
        ArrayList<Integer> questions = new ArrayList<>();
        Integer totalQuestions = this.questionService.countQuestions();
        int i = 0;
        while (i < 5) {
            int num = (int) Math.floor(Math.random() * (1 - (totalQuestions + 1)) + (totalQuestions + 1));
            if (!questions.contains(num) && questionService.getQuestionByNit(num) != null) {
                questions.add(num);
                i++;
            }
        }

        ExamModel exam = new ExamModel(0, student.getNit_student(), questions, nit_assignment);
        this.examService.saveExam(exam);
        return examService.getExamId(student.getNit_student());
    }

    /*
     * Crea una citacion para el examen dependiendo el lugar de origen
     */
    public Integer createAssignment(StudentModel student) {

        ZonedDateTime date = ZonedDateTime.now().plusDays(randomNumber(3, 10))
                .plusMonths(randomNumber(0, 5)).plusHours(randomNumber(6, 10))
                .minusMinutes(randomNumber(12, 100));

        String dateBogota = formatDate(date);
        String dateLocal = convertDate(date);


        AssignmentModel assignmentModel = new AssignmentModel(student.getNit_student(), dateLocal, dateBogota);
        this.assignmentService.saveAssignment(assignmentModel);
        return Math.toIntExact(this.assignmentService.getAssignmentId(student.getNit_student()).getNit_Assignment());

    }

    /*
     * Convierte la fecha a la zona horaria indicada
     */
    public String convertDate(ZonedDateTime date) {
        return formatDate(date.withZoneSameInstant(ZoneId.of(String.valueOf(date.getZone()))));
    }

    /*
     * Cnvierte la fecha al formato necesario
     */
    public String formatDate(ZonedDateTime date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss' - 'EEEE dd 'de' MMMM 'de' YYYY");
        String formattedString = date.format(formatter);
        return formattedString;
    }

    /*
     * Devuelve un estudiante por numero de identificacion
     */
    @GetMapping(path = "/{nit}")
    public StudentModel getStudentById(@PathVariable("nit") String nit) {
        return this.studentService.getStudentById(nit);
    }

    /*
     * crea una citacion al examen
     */
    public String getAssigment(StudentModel s) {
        AssignmentModel a = this.assignmentService.getAssignmentId(s.getNit_student());
        return s.toString() + a.toString();
    }

    /*
     * Crea un numero random
     */
    public int randomNumber(int min, int max) {
        return (int) (Math.random() * ((max + 1) - min)) + min;
    }

}
