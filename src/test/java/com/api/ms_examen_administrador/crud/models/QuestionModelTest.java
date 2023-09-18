package com.api.ms_examen_administrador.crud.models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class QuestionModelTest {

    QuestionModel question;
    
    @BeforeEach
    void setUp() {
         question =  new QuestionModel(001L, "Cual es el lenguaje utilizado?", 
                 null, "Java");
    }

    @Test
    void getNit_Question() {
        Assertions.assertEquals(001L, question.getNit_Question());
    }

    @Test
    void setNit_Question() {
        question.setNit_Question(002L);
        Assertions.assertNotEquals(001L, question.getNit_Question());
    }

    @Test
    void getHeader() {
        Assertions.assertNotEquals("", question.getHeader());
    }

    @Test
    void setHeader() {
        question.setHeader("");
        Assertions.assertEquals("", question.getHeader());
    }

    @Test
    void getOptions() {
        Assertions.assertEquals(null, question.getOptions());
    }

    @Test
    void setOptions() {
        ArrayList<String> options = new ArrayList<>();
        question.setOptions(options);
        Assertions.assertNotNull(question.getOptions());
    }

    @Test
    void getOptionValid() {
        Assertions.assertEquals("Java", question.getOptionValid());
    }

    @Test
    void setOptionValid() {
        question.setOptionValid("Python");
        Assertions.assertNotNull("Java", question.getOptionValid());
    }
}