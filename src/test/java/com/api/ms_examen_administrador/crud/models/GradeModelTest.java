package com.api.ms_examen_administrador.crud.models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GradeModelTest {

    GradeModel gradeModel;

    @BeforeEach
    void setUp() {
        gradeModel = new GradeModel("001", null, 100, "1094");
    }

    @Test
    void getNit_grade() {
        Assertions.assertEquals("001", gradeModel.getNit_grade());
    }

    @Test
    void setNit_grade() {
        gradeModel.setNit_grade("002");
        Assertions.assertNotEquals("001", gradeModel.getNit_grade());
    }

    @Test
    void getAnswer() {
        Assertions.assertNull(gradeModel.getAnswer());
    }

    @Test
    void setAnswer() {
        ArrayList<String> answers = new ArrayList<>();
        gradeModel.setAnswer(answers);
        Assertions.assertNotNull(gradeModel.getAnswer());
    }

    @Test
    void getTotal() {
        Assertions.assertEquals(100, gradeModel.getTotal());
    }

    @Test
    void setTotal() {
        gradeModel.setTotal(75);
        Assertions.assertNotEquals(100, gradeModel.getTotal());
    }

    @Test
    void getNit_student() {
        Assertions.assertEquals("1094", gradeModel.getNit_student());
    }

    @Test
    void setNit_student() {
        gradeModel.setNit_student("100093");
        Assertions.assertNotEquals("1094", gradeModel.getNit_student());
    }
}