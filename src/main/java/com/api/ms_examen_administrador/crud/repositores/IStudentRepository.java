package com.api.ms_examen_administrador.crud.repositores;

import com.api.ms_examen_administrador.crud.models.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
/**
 * Clase Repository para el estudiante
 * @author Diego Andres Riveros Lopez
 */
public interface IStudentRepository extends JpaRepository <StudentModel, Long> {

    @Query(value = "SELECT * FROM student q WHERE q.nit_student = ?",
            nativeQuery = true)
    public StudentModel getStudent(String nit_student);

}
