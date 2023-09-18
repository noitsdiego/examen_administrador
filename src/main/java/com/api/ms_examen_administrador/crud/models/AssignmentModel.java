package com.api.ms_examen_administrador.crud.models;
import jakarta.persistence.*;


@Entity
@Table(name ="Assignment")
/**
 * Clase Model para la citacion
 * @author Diego Andres Riveros Lopez
 */
public class AssignmentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long nit_Assignment;

    @Column(unique = true)
    private String nit_student;

    @Column
    private String local_Time;

    @Column
    private String Bogota_Time;

    public AssignmentModel() {
    }

    public AssignmentModel(String nit_student, String local_Time, String bogota_Time) {
        this.nit_student = nit_student;
        this.nit_Assignment = nit_Assignment;
        this.local_Time = local_Time;
        Bogota_Time = bogota_Time;
    }

    public Long getNit_Assignment() {
        return nit_Assignment;
    }

    public void setNit_Assignment(Long nit_Assignment) {
        this.nit_Assignment = nit_Assignment;
    }

    public String getLocal_Time() {
        return local_Time;
    }

    public void setLocal_Time(String local_Time) {
        this.local_Time = local_Time;
    }

    public String getOrigin_Time() {
        return Bogota_Time;
    }

    public void setOrigin_Time(String origin_Time) {
        Bogota_Time = origin_Time;
    }

    public String getNit_student() {
        return nit_student;
    }

    public void setNit_student(String nit_student) {
        this.nit_student = nit_student;
    }

    @Override
    public String toString() {

        return "la fecha para presentar el examen es: \n"
                + "  Hora Bogota: " + Bogota_Time +"\n"
                + "  Hora Local: " + local_Time;
    }
}
