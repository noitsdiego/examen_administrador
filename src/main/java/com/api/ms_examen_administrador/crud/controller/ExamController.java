package com.api.ms_examen_administrador.crud.controller;

import com.api.ms_examen_administrador.crud.models.*;
import com.api.ms_examen_administrador.crud.services.AnswerService;
import com.api.ms_examen_administrador.crud.services.ExamService;
import com.api.ms_examen_administrador.crud.services.GradeService;
import com.api.ms_examen_administrador.crud.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/exam")
/**
 * Clase controller para el examen
 * @author Diego Andres Riveros Lopez
 */
public class ExamController {

    @Autowired
    /*
     * Inyeccion de dependencias para el examen
     */
    private ExamService examService;

    @Autowired
    /*
     * Inyeccion de dependencias para las respuestas
     */
    private AnswerService answerService;

    @Autowired
    /*
     * Inyeccion de dependencias para la calificacion
     */
    private GradeService GradeService;

    @Autowired
    /*
     * Inyeccion de dependencias para la pregunta
     */
    private QuestionService questionService;

    /*
     * devuelve el examen del estudiante por su documento de identidad
     */
    @GetMapping(path = "/getExam/{nit}")
    public String getExam(@PathVariable("nit") String nit) {
        ExamModel exam = examService.getExam(nit);
        String text = "";

        for (int i = 0; i < exam.getQuestions().size(); i++) {
            QuestionModel question = questionService.getQuestionByNit(exam.getQuestions().get(i));
            text += question.getHeader() + "\n";
            for (String option : question.getOptions()) {
                text += "  -" + option + "\n";
            }
            text += "\n";
        }

        return text;

    }

    /*
     * realiza el examen del estudiante por su documento de identidad
     */
    @PostMapping(path = "/resolveExam/{nit}")
    public GradeModel resolveExam(@PathVariable("nit") String nit, @RequestBody ArrayList<String> answers) {

        for (String q : answers) {
            q.toLowerCase();
        }

        ExamModel exam = examService.getExam(nit);
        GradeModel Grade = GradeService.getGrade(nit);
        if (Grade == null) {
            AnswerModel answer = new AnswerModel("01" + nit, exam.getQuestions(), answers, nit);
            this.examService.runExam(nit);
            this.answerService.saveAnswers(answer);
            return qualifyExam(answers, exam.getQuestions(), nit);
        } else {
            return null;
        }

    }

    /*
     * Entrega la calificacion del estudiante en base a sus respuestas
     */
    public GradeModel qualifyExam(ArrayList<String> answers, ArrayList<Integer> questions, String nit) {
        int total = 0;
        for (int i = 0; i < questions.size(); i++) {
            QuestionModel question = questionService.getQuestionByNit(questions.get(i));
            if (question.getOptionValid().toLowerCase().equals(answers.get(i).toLowerCase())) {
                total++;
            }
        }
        GradeModel q = new GradeModel("001" + nit, answers, (total * 100) / 5, nit);
        GradeService.saveGrade(q);
        return q;
    }

}
