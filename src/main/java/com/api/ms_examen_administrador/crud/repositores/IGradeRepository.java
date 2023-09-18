package com.api.ms_examen_administrador.crud.repositores;
import com.api.ms_examen_administrador.crud.models.GradeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
/**
 * Clase Repository para la calificacion
 * @author Diego Andres Riveros Lopez
 */
public interface IGradeRepository extends JpaRepository <GradeModel, Long> {

    @Query(value = "SELECT total FROM Grade q WHERE q.nit_student = ?",
            nativeQuery = true)
    public int getGradeTotal(String nit_question);

    @Query(value = "SELECT * FROM Grade q WHERE q.nit_student = ?",
            nativeQuery = true)
    public GradeModel getGrade(String nit_student);

}
