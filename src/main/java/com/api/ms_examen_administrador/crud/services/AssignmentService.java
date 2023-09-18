package com.api.ms_examen_administrador.crud.services;

import com.api.ms_examen_administrador.crud.models.AssignmentModel;
import com.api.ms_examen_administrador.crud.repositores.IAssignmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
/**
 * Clase Service para la citacion
 * @author Diego Andres Riveros Lopez
 */
public class AssignmentService {

    @Autowired
    /*
     * Inyeccion de dependencia de la citacion
     */
    IAssignmentRepository iAssignmentRepository;

    /*
     * Guarda la citacion en la DB
     */
    public AssignmentModel saveAssignment(AssignmentModel assignment){
        return iAssignmentRepository.save(assignment);
    }

    /*
     * Devuelve la citacion en la DB
     */
    public AssignmentModel getAssignmentId(String nit){
        return iAssignmentRepository.searchNit_assigment(nit);
    }


}
