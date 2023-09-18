package com.api.ms_examen_administrador.crud.services;

import com.api.ms_examen_administrador.crud.models.QuestionModel;
import com.api.ms_examen_administrador.crud.repositores.IQuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
/**
 * Clase Service para la pregunta
 * @author Diego Andres Riveros Lopez
 */
public class QuestionService {

    @Autowired
    /*
     * Inyeccion de dependencia de la pregunta
     */
    IQuestionRepository iQuestionRepository;

    /*
     * Devuelve la pregunta de DB
     */
    public ArrayList<QuestionModel> getQuestions() {
        return (ArrayList<QuestionModel>) iQuestionRepository.findAll();
    }

    /*
     * Devuelve la pregunta por ID de la DB
     */
    public QuestionModel getQuestionByNit(int nit) {
        try {
            return iQuestionRepository.searchQuestion(nit);
        } catch (Exception e) {
            return null;
        }

    }

    /*
     * Agrega la calificacion a la DB
     */
    public QuestionModel addQuestion(QuestionModel question) {
        question.getOptionValid().toLowerCase();
        for (String q :
                question.getOptions()) {
            q.toLowerCase();
        }
        return iQuestionRepository.save(question);
    }

    /*
     * Contar las preguntas de la DB
     */
    public int countQuestions() {
        return iQuestionRepository.countD();
    }

    /*
     * Eliminar la pregunta por ID de la DB
     */
    public boolean deleteQuestion(Long nit) {
        try {
            iQuestionRepository.deleteById(nit);
            return true;
        } catch (Exception e) {
            return false;
        }
    }


}
