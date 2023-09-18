package com.api.ms_examen_administrador.crud.models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssignmentModelTest {

    AssignmentModel assignment;
    
    @BeforeEach
    void setUp() {
        
        assignment = new AssignmentModel("1094", "2022","2023");
        assignment.setNit_Assignment(001L);
    }


    @Test
    void getNit_Assignment() {
        Assertions.assertEquals(001L,  assignment.getNit_Assignment());
    }

    @Test
    void setNit_Assignment() {
        assignment.setNit_Assignment(002L);
        Assertions.assertNotEquals(001L,  assignment.getNit_Assignment());
    }

    @Test
    void getLocal_Time() {
        Assertions.assertEquals("2022", assignment.getLocal_Time());
    }

    @Test
    void setLocal_Time() {
        assignment.setLocal_Time("2020");
        Assertions.assertNotEquals("2022", assignment.getLocal_Time());
    }

    @Test
    void getOrigin_Time() {
        Assertions.assertEquals(assignment.getOrigin_Time(), "2023");
    }

    @Test
    void setOrigin_Time() {
        assignment.setOrigin_Time("3002");
        Assertions.assertNotEquals("2023", assignment.getOrigin_Time());
    }

    @Test
    void getNit_student() {
        Assertions.assertEquals(assignment.getNit_student(), "1094");
    }

    @Test
    void setNit_student() {
        assignment.setNit_student("10994");
        Assertions.assertNotEquals("1094", assignment.getNit_student());
    }
}