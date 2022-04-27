/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_eje3;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Comision {
    private int totalClases;
    private Estudiante[] listaEstudiantes;
    private int totalEstudiante;
Scanner teclado = new Scanner(System.in);
    public Comision() {
    }

    public Comision(int totalClases, Estudiante[] listaEstudiantes, int totalEstudiante) {
        this.totalClases = totalClases;
        this.listaEstudiantes = listaEstudiantes;
        this.totalEstudiante = totalEstudiante;
    }

    public int getTotalClases() {
        return totalClases;
    }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   

    public Estudiante[] getListaEstudiantes() {
        return listaEstudiantes;
    }

    public int getTotalEstudiante() {
        return totalEstudiante;
    }

    public void setTotalClases(int totalClases) {
        this.totalClases = totalClases;
    }

    public void setListaEstudiantes(Estudiante[] listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    public void setTotalEstudiante(int totalEstudiante) {
        this.totalEstudiante = totalEstudiante;
    }
   /* public void Comision(){
    
    }*/
    public void comision(int totalClases){
    
    }
   public void agregarEstudiante(){
   Estudiante e = null;
   System.out.println("Ingresar el apellido");
   e.setApellidos(teclado.nextLine());
   System.out.println("Ingrese nombre");
   e.setNombres(teclado.nextLine());
   System.out.println("Ingrese correo elactronico");
   e.setEmail(teclado.nextLine());
   System.out.println("Ingrese su LU ");
   e.setLu(teclado.nextInt());
   }
    

public void agregarEstudiante(String apellido,String nombre,int lu, String email){
 Estudiante e = new Estudiante();
 e.setApellidos(apellido);
 e.setNombres(nombre);
 e.setLu(lu);
 e.setEmail(email);
}
public void mostrarLista(){

}



private void ordenarLista(){
}
public Estudiante buscarEstudiante(int lu){

}
public void mostrarRegulares(){}

public void regularizarEstudiantes(){

}
}
