package com.api.ms_examen_administrador.crud.repositores;
import com.api.ms_examen_administrador.crud.models.ExamModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
/**
 * Clase Repository para el examen
 * @author Diego Andres Riveros Lopez
 */
public interface IExamRepository extends JpaRepository <ExamModel, Long> {

    @Query(value = "SELECT nit_exam FROM exam e WHERE e.nit_student = ?1",
            nativeQuery = true)
    public String searchNit_exam(String nit);

    @Query(value = "SELECT * FROM exam e WHERE e.nit_student = ?",
            nativeQuery = true)
    public ExamModel searchExam(String nit);

    @Query(value = "UPDATE exam SET execute = 1  WHERE  nit_student = ?",
            nativeQuery = true)
    public boolean runExam(String nit);



}
