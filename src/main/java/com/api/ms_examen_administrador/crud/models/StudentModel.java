package com.api.ms_examen_administrador.crud.models;

import jakarta.persistence.*;

@Entity
@Table(name ="Student")
/**
 * Clase Model para el estudiante
 * @author Diego Andres Riveros Lopez
 */
public class StudentModel {

    @Id
    @Column(unique = true)
    private String nit_student;

    @Column
    private String name;

    @Column
    private String age;

    @Column
    private String city;

    @Column
    private String nit_Exam;

    @Column
    private String ZoneTime;

    public StudentModel() {
    }

    public StudentModel(String nit_student, String name, String age, String city, String nit_Exam, String zoneTime) {
        this.nit_student = nit_student;
        this.name = name;
        this.age = age;
        this.city = city;
        this.nit_Exam = nit_Exam;
        ZoneTime = zoneTime;
    }

    public String getNit_student() {
        return nit_student;
    }

    public void setNit_student(String nit_student) {
        this.nit_student = nit_student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNit_Exam() {
        return nit_Exam;
    }

    public void setNit_Exam(String nit_Exam) {
        this.nit_Exam = nit_Exam;
    }

    public String getZoneTime() {
        return ZoneTime;
    }

    public void setZoneTime(String zoneTime) {
        ZoneTime = zoneTime;
    }

    @Override
    public String toString() {
        return "Estudiante: \n" +
                "  NIT: " + nit_student + '\n' +
                "  Nombre: " + name + '\n' +
                "  edad: " + age + '\n' +
                "  Ciudad: " + city + '\n' +
                "  Zona Horaria: " + ZoneTime + "\n\n";
    }
}
