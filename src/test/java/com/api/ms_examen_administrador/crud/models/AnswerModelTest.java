package com.api.ms_examen_administrador.crud.models;

import jakarta.persistence.Column;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AnswerModelTest {

    AnswerModel answer;

    @BeforeEach
    void setUp() {
        answer = new AnswerModel("001", null, null, "1090");
    }


    @Test
    void getQuestions() {
        Assertions.assertEquals(answer.getQuestions(), null);
    }

    @Test
    void setQuestions() {
        ArrayList<Integer> questionsTest = new ArrayList<>();
        answer.setQuestions(questionsTest);
        Assertions.assertNotNull(answer.getQuestions());
    }

    @Test
    void getAnswers() {
        Assertions.assertEquals(answer.getAnswers(), null);
    }

    @Test
    void setAnswers() {
        ArrayList<String> answerTest = new ArrayList<>();
        answer.setAnswers(answerTest);
        Assertions.assertNotNull(answer.getAnswers());
    }

    @Test
    void getNit_student() {
        Assertions.assertEquals(answer.getNit_student(), "1090");
    }

    @Test
    void setNit_student() {
        answer.setNit_student("1094");
        Assertions.assertNotEquals(answer.getNit_student(), "1090");
    }
}