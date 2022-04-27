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
    private int totalEstudiante=0;
Scanner teclado = new Scanner(System.in);
    
    public Comision() {
        listaEstudiantes=  new Estudiante[100];
    }

    public Comision(int totalClases, Estudiante[] listaEstudiantes, int totalEstudiante) {
        this.totalClases = totalClases;
        this.listaEstudiantes = listaEstudiantes;
        this.totalEstudiante = totalEstudiante;
         listaEstudiantes=  new Estudiante[100];
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
   Estudiante e = new Estudiante();
   System.out.println("Ingresar el apellido");
   e.setApellidos(teclado.nextLine());
   System.out.println("Ingrese nombre");
   e.setNombres(teclado.nextLine());
   System.out.println("Ingrese correo elactronico");
   e.setEmail(teclado.nextLine());
   System.out.println("Ingrese su LU ");
   e.setLu(teclado.nextInt());
   listaEstudiantes[this.totalEstudiante]=e;
   this.totalEstudiante+=1;
   }
    

public void agregarEstudiante(String apellido,String nombre,int lu, String email){
 Estudiante e = new Estudiante();
 e.setApellidos(apellido);
 e.setNombres(nombre);
 e.setLu(lu);
 e.setEmail(email);
}
public void mostrarLista(){
int n=this.totalEstudiante;
    for(int i=0;i<n;i++){
      System.out.println("nombre "+  listaEstudiantes[i].toString());
       /* System.out.println("apellido  "+ listaEstudiantes[i].getApellidos());
       System.out.println("nombre "+  listaEstudiantes[i].getEmail());
         System.out.println("nombre "+  listaEstudiantes[i].getLu());*/
}



private void ordenarLista(){
}
public Estudiante buscarEstudiante(int lu){
int n=this.totalEstudiante;
    for(int i=0;i<n;i++){  
     if(listaEstudiantes[i].getLu()==lu) return listaEstudiantes[i];   
        
        
    }
}
public void mostrarRegulares(){
    int n=this.totalEstudiante;
    for(int i=0;i<n;i++){
     if(listaEstudiantes[i].getNotap1()>60) && (listaEstudiantes[i]>60));
           System.out.println("Estudiante regular"+ listaEstudiantes[i].toString());
    
    }

}

public void regularizarEstudiantes(){

}
}
