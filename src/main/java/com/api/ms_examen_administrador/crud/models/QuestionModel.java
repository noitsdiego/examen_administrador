package com.api.ms_examen_administrador.crud.models;
import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
@Table(name ="Question")
/**
 * Clase Model para la pregunta
 * @author Diego Andres Riveros Lopez
 */
public class QuestionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long nit_Question;

    @Column(unique = true)
    private String header;

    @Column
    private ArrayList<String> options;

    @Column
    private String optionValid;

    public QuestionModel() {
    }

    public QuestionModel(Long nit_Question, String header, ArrayList<String> options, String optionValid) {
        this.nit_Question = nit_Question;
        this.header = header;
        this.options = options;
        this.optionValid = optionValid;
    }

    public Long getNit_Question() {
        return nit_Question;
    }

    public void setNit_Question(Long nit_Question) {
        this.nit_Question = nit_Question;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    public void setOptions(ArrayList<String> options) {
        this.options = options;
    }

    public String getOptionValid() {
        return optionValid;
    }

    public void setOptionValid(String optionValid) {
        this.optionValid = optionValid;
    }
}
