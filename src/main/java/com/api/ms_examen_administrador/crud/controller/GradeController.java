package com.api.ms_examen_administrador.crud.controller;

import com.api.ms_examen_administrador.crud.models.*;
import com.api.ms_examen_administrador.crud.services.ExamService;
import com.api.ms_examen_administrador.crud.services.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/grade")
/**
 * Clase controller para la calificacion
 * @author Diego Andres Riveros Lopez
 */
public class GradeController {

    @Autowired
    /*
     * Inyeccion de dependencias para la calificacion
     */
    private GradeService gradeService;

    @Autowired
    /*
     * Inyeccion de dependencias para el examen
     */
    private ExamService examService;

    /*
     * devuelve la calificacion del estudiante por su documento de identidad
     */
    @GetMapping(path = "/{nit}")
    public String getGradeById(@PathVariable("nit") String nit){

        GradeModel q = this.gradeService.getGrade(nit);

        if (q == null) {
            return "El examen no ha sido contestado";
        }else{
            int total = this.gradeService.getGradeById(nit);
            return "La calificación del examen es " + total;
        }

    }

}
