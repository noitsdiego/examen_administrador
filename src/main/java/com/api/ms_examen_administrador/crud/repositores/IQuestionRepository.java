package com.api.ms_examen_administrador.crud.repositores;
import com.api.ms_examen_administrador.crud.models.QuestionModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
/**
 * Clase Repository para la pregunta
 * @author Diego Andres Riveros Lopez
 */
public interface IQuestionRepository extends JpaRepository <QuestionModel, Long> {


    @Query(value ="SELECT COUNT(*) FROM question",nativeQuery = true)
    public int countD();

    @Query(value = "SELECT * FROM question q WHERE q.nit_question = ?",
            nativeQuery = true)
    public QuestionModel searchQuestion(int nit_question);
}
