/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenuf6;

import java.sql.Date;

/**
 *
 * @author arnaugarciaalvarez
 */
public class Alumnos {
    
    private int idAlumno;
    private String nombreAlumno;
    private String descripAlumno;
    private Date nacimientoAlumno;
    private boolean matriculaAlumno;

    public Alumnos(int idAlumno, String nombreAlumno, String descripAlumno, Date nacimientoAlumno, boolean matriculaAlumno) {
        this.idAlumno = idAlumno;
        this.nombreAlumno = nombreAlumno;
        this.descripAlumno = descripAlumno;
        this.nacimientoAlumno = nacimientoAlumno;
        this.matriculaAlumno = matriculaAlumno;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public String getDescripAlumno() {
        return descripAlumno;
    }

    public void setDescripAlumno(String descripAlumno) {
        this.descripAlumno = descripAlumno;
    }

    public Date getNacimientoAlumno() {
        return nacimientoAlumno;
    }

    public void setNacimientoAlumno(Date nacimientoAlumno) {
        this.nacimientoAlumno = nacimientoAlumno;
    }

    public boolean isMatriculaAlumno() {
        return matriculaAlumno;
    }

    public void setMatriculaAlumno(boolean matriculaAlumno) {
        this.matriculaAlumno = matriculaAlumno;
    }

    @Override
    public String toString() {
        return "Alumnos{" + "idAlumno=" + idAlumno + ", nombreAlumno=" + nombreAlumno + ", descripAlumno=" + descripAlumno + ", nacimientoAlumno=" + nacimientoAlumno + ", matriculaAlumno=" + matriculaAlumno + '}';
    }
    
    
    
}
