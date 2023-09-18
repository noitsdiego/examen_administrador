package com.api.ms_examen_administrador.crud.controller;

import com.api.ms_examen_administrador.crud.models.QuestionModel;
import com.api.ms_examen_administrador.crud.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/questions")
/**
 * Clase controller para las preguntas del examen
 * @author Diego Andres Riveros Lopez
 */
public class QuestionController {

    @Autowired
    /*
     * Inyeccion de dependencias para la pregunta
     */
    private QuestionService questionService;


    /*
     * devuelve todas las preguntas registradas en la DB
     */
    @GetMapping(path = "/getAll")
    public ArrayList<QuestionModel> getQuestions(){
        return this.questionService.getQuestions();
    }

    /*
     * Registra una nueva pregunta
     */
    @PostMapping(path = "/add")
    public QuestionModel addQuestions(@RequestBody QuestionModel question){
        return this.questionService.addQuestion(question);
    }

    /*
     * Elimina una pregunta
     */
    @DeleteMapping(path = "/delete/{nit}")
    public String deleteQuestions(@PathVariable("nit") Long nit){
        boolean cent = this.questionService.deleteQuestion(nit);

        if (cent){
            return "Question deleted!";
        }else{
            return "Error, we have a problem and cant deleted Question";
        }
    }

}
