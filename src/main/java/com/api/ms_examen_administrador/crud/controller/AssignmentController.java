package com.api.ms_examen_administrador.crud.controller;

import com.api.ms_examen_administrador.crud.models.AssignmentModel;
import com.api.ms_examen_administrador.crud.services.AssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/assignment")
/**
 * Clase controller para el asignamiento del examen
 * @author Diego Andres Riveros Lopez
 */
public class AssignmentController {

    @Autowired
    /*
     * Inyeccion de dependencias para el asignamiento
     */
    private AssignmentService assignmentService;


    /*
     * devuelve el asignamiento del examen del estudiante por su documento de identidad
     */
    @GetMapping(path = "/{nit}")
    public AssignmentModel getAssigment(@PathVariable("nit") String nit){
        AssignmentModel a = this.assignmentService.getAssignmentId(nit);
        return a;
    }
}
