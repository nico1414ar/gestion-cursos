/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nico
 */
public class Asistencia {
    private int id;
    private int idAlumno;
    private int idCurso;
    private boolean presente;

    public Asistencia() {}

    public Asistencia(int idAlumno, int idCurso, boolean presente) {
        this.idAlumno = idAlumno;
        this.idCurso = idCurso;
        this.presente = presente;
    }

    // Getters y setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getIdAlumno() { return idAlumno; }
    public void setIdAlumno(int idAlumno) { this.idAlumno = idAlumno; }

    public int getIdCurso() { return idCurso; }
    public void setIdCurso(int idCurso) { this.idCurso = idCurso; }

    public boolean isPresente() { return presente; }
    public void setPresente(boolean presente) { this.presente = presente; }
}
