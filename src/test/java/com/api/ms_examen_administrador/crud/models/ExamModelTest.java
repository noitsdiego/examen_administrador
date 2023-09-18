package com.api.ms_examen_administrador.crud.models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ExamModelTest {

    ExamModel exam;

    @BeforeEach
    void setUp() {
         exam = new ExamModel( 0, "1094", null, 001);
    }

    @Test
    void isExecute() {
        Assertions.assertEquals(0, exam.isExecute());
    }

    @Test
    void setExecute() {
        exam.setExecute(1);
        Assertions.assertNotEquals(0, exam.isExecute());
    }

    @Test
    void getNit_student() {
        Assertions.assertEquals("1094", exam.getNit_student());
    }

    @Test
    void setNit_student() {
        exam.setNit_student("10092");
        Assertions.assertNotEquals("1094", exam.getNit_student());
    }

    @Test
    void getQuestions() {
        Assertions.assertEquals(null, exam.getQuestions());
    }

    @Test
    void setQuestions() {
        ArrayList<Integer> questions = new ArrayList<>();
        exam.setQuestions(questions);
        Assertions.assertNotEquals(null, exam.getQuestions());
    }

    @Test
    void getNit_Assignment() {
        Assertions.assertEquals(001, exam.getNit_Assignment());
    }

    @Test
    void setNit_Assignment() {
        exam.setNit_Assignment(002);
        Assertions.assertNotEquals(001, exam.getNit_Assignment());
    }
}