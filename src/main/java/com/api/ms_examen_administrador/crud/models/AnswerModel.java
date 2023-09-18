package com.api.ms_examen_administrador.crud.models;
import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
@Table(name ="Answer")
/**
 * Clase Model para la respuesta
 * @author Diego Andres Riveros Lopez
 */
public class AnswerModel {

    @Id
    @Column
    private String nit_Answer;

    @Column
    private ArrayList<Integer> questions;

    @Column
    private ArrayList<String> answers;


    @Column(unique = true)
    private String nit_student;

    public AnswerModel() {
    }

    public AnswerModel(String nit_Answer, ArrayList<Integer> questions, ArrayList<String> answers, String nit_student) {
        this.nit_Answer = nit_Answer;
        this.questions = questions;
        this.answers = answers;
        this.nit_student = nit_student;
    }

    public ArrayList<Integer> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Integer> questions) {
        this.questions = questions;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }

    public String getNit_student() {
        return nit_student;
    }

    public void setNit_student(String nit_student) {
        this.nit_student = nit_student;
    }
}
