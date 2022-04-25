/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_eje3;

/**
 *
 * @author alumno
 */
public class Estudiante {
    
 private String apellidos;
 private String nombres;
 private int lu;
 private String email;
 public boolean regular;
 private int notap1;
 private int notap2;
 private int asistencia;



    public Estudiante (String apellidos, String nombres, int lu, String email, boolean regular, int notap1, int notap2, int asistencia) {
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.lu = lu;
        this.email = email;
        this.regular = regular;
        this.notap1 = notap1;
        this.notap2 = notap2;
        this.asistencia = asistencia;
    }

    Estudiante() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public int getLu() {
        return lu;
    }

    public String getEmail() {
        return email;
    }

    public boolean isRegular() {
        return regular;
    }

    public int getNotap1() {
        return notap1;
    }

    public int getNotap2() {
        return notap2;
    }

    public int getAsistencia() {
        return asistencia;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setLu(int lu) {
        this.lu = lu;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRegular(boolean regular) {
        this.regular = regular;
    }

    public void setNotap1(int notap1) {
        this.notap1 = notap1;
    }

    public void setNotap2(int notap2) {
        this.notap2 = notap2;
    }

    public void setAsistencia(int asistencia) {
        this.asistencia = asistencia;
    }
   
 
}


