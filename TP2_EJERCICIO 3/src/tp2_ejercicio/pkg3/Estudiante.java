/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_ejercicio.pkg3;

/**
 *
 * @author alumno
 */
public class Estudiante {
    private String apellido;
    private String nombre;
    private int lu;
    private String email;
    private boolean regular;
    private int notaP1;
    private int notaP2;
    private int notaR;
    private int asistencia;
    
    public Estudiante (){
        this.apellido = "apellido";
        this.nombre = "nombre";
        this.lu = 0000;
        this.email = "email@gmail.com";
        this.asistencia = 0;
    }
    public Estudiante(String apellido, String nombre, int lu, String email) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.lu = lu;
        this.email = email;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLu() {
        return lu;
    }

    public void setLu(int lu) {
        this.lu = lu;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isRegular() {
        return regular;
    }

    public void setRegular(boolean regular) {
        this.regular = regular;
    }

    public int getNotaP1() {
        return notaP1;
    }

    public void setNotaP1(int notaP1) {
        this.notaP1 = notaP1;
    }

    public int getNotaP2() {
        return notaP2;
    }

    public void setNotaP2(int notaP2) {
        this.notaP2 = notaP2;
    }

    public int getNotaR() {
        return notaR;
    }

    public void setNotaR(int notaR) {
        this.notaR = notaR;
    }

    public int getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(int asistencia) {
        this.asistencia = asistencia;
    }
    
    public void incAsistencia(){
        this.asistencia++;
    }
    public void incAsistencia(int c){
        this.asistencia += c;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "apellido=" + apellido + ", nombre=" + nombre + ", lu=" + lu + ", email=" + email + ", regular=" + regular + ", notaP1=" + notaP1 + ", notaP2=" + notaP2 + ", notaR=" + notaR + ", asistencia=" + asistencia + '}';
    }
    
    
}
