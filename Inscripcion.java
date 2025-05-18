/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nico
 */
import java.sql.Date;

public class Inscripcion {
    private int id;
    private int idAlumno;
    private int idCurso;
    private Date fechaInscripcion;

    public Inscripcion() {}

    public Inscripcion(int idAlumno, int idCurso, Date fechaInscripcion) {
        this.idAlumno = idAlumno;
        this.idCurso = idCurso;
        this.fechaInscripcion = fechaInscripcion;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getIdAlumno() { return idAlumno; }
    public int getIdCurso() { return idCurso; }
    public Date getFechaInscripcion() { return fechaInscripcion; }
}
