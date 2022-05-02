/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2.eje6;

/**
 *
 * @author alumno
 */
public class Medico {
    private String nombre;
    private int matricula;
    private enum especialidad {f,c,o};
    private int cupo;
    private Historia [] historias;
    private int canth;

    public Medico() {
    }

    public Medico(String nombre, int matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
    }

    public Medico(String nombre, int matricula, int cupo) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.cupo = cupo;
    }
    public Medico(String nombre, int matricula, enum especialidad) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.especialidad=espedcialidad;
    }
    
    public Medico(String nombre, int matricula, int cupo, enum especialidad) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.cupo = cupo;
        this.especialidad=especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getMatricula() {
        return matricula;
    }
    public enum getespecialidad(){
    return especialidad;
    }
    

public boolean disponibilidad(){

}

public boolean asignar_historia(String His){


}
public void (String His){

} 
}
