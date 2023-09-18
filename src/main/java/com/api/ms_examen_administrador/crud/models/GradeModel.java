package com.api.ms_examen_administrador.crud.models;
import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
@Table(name ="Grade")
/**
 * Clase Model para la calificacion
 * @author Diego Andres Riveros Lopez
 */
public class GradeModel {
    @Id
    @Column
    private String nit_grade;

    @Column
    private ArrayList<String> answer;

    @Column
    private int total;

    @Column(unique = true)
    private String nit_student;

    public GradeModel(String nit_grade, ArrayList<String> answer, int total, String nit_student) {
        this.nit_grade = nit_grade;
        this.answer = answer;
        this.total = total;
        this.nit_student = nit_student;
    }

    public GradeModel() {
    }

    public String getNit_grade() {
        return nit_grade;
    }

    public void setNit_grade(String nit_grade) {
        this.nit_grade = nit_grade;
    }

    public ArrayList<String> getAnswer() {
        return answer;
    }

    public void setAnswer(ArrayList<String> answer) {
        this.answer = answer;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getNit_student() {
        return nit_student;
    }

    public void setNit_student(String nit_student) {
        this.nit_student = nit_student;
    }
}
