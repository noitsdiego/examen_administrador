package com.api.ms_examen_administrador.crud.services;

import com.api.ms_examen_administrador.crud.models.AnswerModel;
import com.api.ms_examen_administrador.crud.repositores.IAnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
/**
 * Clase Service para la respuesta
 * @author Diego Andres Riveros Lopez
 */
public class AnswerService {

    @Autowired
    /*
     * Inyeccion de dependencia de pregunta
     */
            IAnswerRepository answerRepository;

    /*
     * Guarda la pregunta en la DB
     */
    public AnswerModel saveAnswers(AnswerModel answer) {
        return answerRepository.save(answer);
    }

}
