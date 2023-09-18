package com.api.ms_examen_administrador.crud.services;

import com.api.ms_examen_administrador.crud.models.GradeModel;
import com.api.ms_examen_administrador.crud.repositores.IGradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
/**
 * Clase Service para la calificacion
 * @author Diego Andres Riveros Lopez
 */
public class GradeService {

    @Autowired
    /*
     * Inyeccion de dependencia de la calificacion
     */
    IGradeRepository iGradeRepository;

    /*
     * Devuelve la calificacion por ID de la DB
     */
    public int getGradeById(String nit){
        return iGradeRepository.getGradeTotal(nit);
    }

    /*
     * Devuelve la calificacion por ID de la DB
     */
    public GradeModel getGrade(String nit){
        return iGradeRepository.getGrade(nit);
    }

    /*
     * Guarda la calificacion en la DB
     */
    public GradeModel saveGrade(GradeModel Grade){
        return iGradeRepository.save(Grade);
    }


}
