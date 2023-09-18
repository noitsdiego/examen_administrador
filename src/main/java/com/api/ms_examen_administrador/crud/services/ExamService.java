package com.api.ms_examen_administrador.crud.services;

import com.api.ms_examen_administrador.crud.models.ExamModel;
import com.api.ms_examen_administrador.crud.repositores.IExamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
/**
 * Clase Service para el examen
 * @author Diego Andres Riveros Lopez
 */
public class ExamService {

    @Autowired
    /*
     * Inyeccion de dependencia del examen
     */
    IExamRepository iExamRepository;

    /*
     * Guarda el examen en la DB
     */
    public ExamModel saveExam(ExamModel exam){
        return iExamRepository.save(exam);
    }

    /*
     * Devuelve el examen por el ID de la DB
     */
    public String getExamId(String nit){
        return iExamRepository.searchNit_exam(nit);
    }

    /*
     * Devuelve el examen
     */
    public ExamModel getExam(String nit){
        return iExamRepository.searchExam(nit);
    }

    /*
     * Realiza el examen
     */
    public void runExam(String nit){
        try{
            iExamRepository.runExam(nit);
        }catch (Exception e){
        }

    }
}
