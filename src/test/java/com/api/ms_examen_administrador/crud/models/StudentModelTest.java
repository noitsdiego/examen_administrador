package com.api.ms_examen_administrador.crud.models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentModelTest {

    StudentModel student;


    @BeforeEach
    void setUp() {
        student = new StudentModel("1094", "Diego", "24", "Medellin", "001", "America");
    }

    @Test
    void getNit_student() {
        Assertions.assertEquals("1094", student.getNit_student());
    }

    @Test
    void setNit_student() {
        student.setNit_student("10093");
        Assertions.assertNotEquals("1094", student.getNit_student());
    }

    @Test
    void getName() {
        Assertions.assertEquals("Diego", student.getName());
    }

    @Test
    void setName() {
        student.setName("Andres");
        Assertions.assertNotEquals("Diego", student.getName());
    }

    @Test
    void getAge() {
        Assertions.assertEquals("24", student.getAge());
    }

    @Test
    void setAge() {
        student.setAge("20");
        Assertions.assertNotEquals("24", student.getAge());
    }

    @Test
    void getCity() {
        Assertions.assertEquals("Medellin", student.getCity());
    }

    @Test
    void setCity() {
        student.setCity("Armenia");
        Assertions.assertNotEquals("Medellin", student.getCity());
    }

    @Test
    void getNit_Exam() {
        Assertions.assertEquals("001", student.getNit_Exam());

    }

    @Test
    void setNit_Exam() {
        student.setNit_Exam("00001");
        Assertions.assertNotEquals("001", student.getNit_Exam());
    }

    @Test
    void getZoneTime() {
        Assertions.assertEquals("America", student.getZoneTime());
    }

    @Test
    void setZoneTime() {
        student.setZoneTime("Europe");
        Assertions.assertNotEquals("America", student.getZoneTime());
    }
}