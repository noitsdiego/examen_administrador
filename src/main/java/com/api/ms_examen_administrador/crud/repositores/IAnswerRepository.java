package com.api.ms_examen_administrador.crud.repositores;
import com.api.ms_examen_administrador.crud.models.AnswerModel;
import com.api.ms_examen_administrador.crud.models.QuestionModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
/**
 * Clase Repository para la respuesta
 * @author Diego Andres Riveros Lopez
 */
public interface IAnswerRepository extends JpaRepository <AnswerModel, Long> {

    @Query(value = "insert into answer (answers, nit_student, questions) values (?, ?, ?)",
            nativeQuery = true)
    public QuestionModel saveAnswers(ArrayList<String> answers,String nit_student, ArrayList<String> questions);

}

