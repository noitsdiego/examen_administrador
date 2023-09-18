package com.api.ms_examen_administrador.crud.services;

import com.api.ms_examen_administrador.crud.models.StudentModel;
import com.api.ms_examen_administrador.crud.repositores.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
/**
 * Clase Service para el estudiantes
 * @author Diego Andres Riveros Lopez
 */
public class StudentService {

    @Autowired
    /*
     * Inyeccion de dependencia del estudiante
     */
    IStudentRepository studentRepository;

    /*
     * Devuelve los estudiantes de la DB
     */
    public ArrayList<StudentModel> getStudents(){
        return (ArrayList<StudentModel>) studentRepository.findAll();
    }

    /*
     * Devuelve el estudiante por ID de la DB
     */
    public StudentModel getStudentById(String nit){
        return studentRepository.getStudent(nit);
    }

    /*
     * Agrega un estudiante de la DB
     */
    public StudentModel addStudent(StudentModel student){
        return studentRepository.save(student);
    }


}
