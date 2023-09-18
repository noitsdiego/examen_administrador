package com.api.ms_examen_administrador.crud.repositores;
import com.api.ms_examen_administrador.crud.models.AssignmentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
/**
 * Clase Repository para la calificacion
 * @author Diego Andres Riveros Lopez
 */
public interface IAssignmentRepository extends JpaRepository <AssignmentModel, Long> {

    @Query(value = "SELECT * FROM assignment a WHERE a.nit_student = ?",
            nativeQuery = true)
    public AssignmentModel searchNit_assigment(String nit);

}
