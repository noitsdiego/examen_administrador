package com.api.ms_examen_administrador.crud.models;
import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
@Table(name ="Exam")
/**
 * Clase Model para el examen
 * @author Diego Andres Riveros Lopez
 */
public class ExamModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long nit_Exam;

    @Column
    private int execute;

    @Column(unique = true)
    private String nit_student;
    @Column
    private ArrayList<Integer> questions;

    @Column
    private int nit_Assignment;

    public ExamModel() {
    }

    public ExamModel(int execute, String nit_student, ArrayList<Integer> questions, int nit_Assignment) {
        this.execute = execute;
        this.nit_student = nit_student;
        this.questions = questions;
        this.nit_Assignment = nit_Assignment;
    }

    public int isExecute() {
        return execute;
    }

    public void setExecute(int execute) {
        this.execute = execute;
    }

    public String getNit_student() {
        return nit_student;
    }

    public void setNit_student(String nit_student) {
        this.nit_student = nit_student;
    }

    public ArrayList<Integer> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Integer> questions) {
        this.questions = questions;
    }

    public int getNit_Assignment() {
        return nit_Assignment;
    }

    public void setNit_Assignment(int nit_Assignment) {
        this.nit_Assignment = nit_Assignment;
    }
}
