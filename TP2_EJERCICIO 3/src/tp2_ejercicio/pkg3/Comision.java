/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_ejercicio.pkg3;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Comision {
    private int totalClases;
    private Estudiante[] listaEstudiantes;
    private int totalEstudiantes;

    public Comision() {
        this.totalClases = 0;
        this.listaEstudiantes = new Estudiante[20];
        this.totalEstudiantes = 0;
    }
    
    public Comision(int totalClases) {
        this.totalClases = totalClases;
        this.listaEstudiantes = new Estudiante[20];
        this.totalEstudiantes = 0;
    }

    public int getTotalClases() {
        return totalClases;
    }

    public void setTotalClases(int totalClases) {
        this.totalClases = totalClases;
    }

    public Estudiante[] getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(Estudiante[] listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    public int getTotalEstudiantes() {
        return totalEstudiantes;
    }

    public void setTotalEstudiantes(int totalEstudiantes) {
        this.totalEstudiantes = totalEstudiantes;
    }
    
    public void agregarEstidiante(){
        Scanner teclado = new Scanner(System.in);
        Estudiante e = new Estudiante();
        String ap,nom,em;
        int l;
        
        System.out.println("Ingreso de datos");
        System.out.println("NOMBRE: ");
        nom = teclado.nextLine();
        e.setNombre(nom);
        System.out.println("APELLIDO: ");
        ap = teclado.nextLine();
        e.setApellido(ap);
        System.out.println("LU: ");
        l=teclado.nextInt();
        e.setLu(l); 
        System.out.println("EMAIL: ");
        em=teclado.next();
        e.setEmail(em);
        e.setNotaP1(0);
        e.setNotaP2(0);
        e.setNotaR(0);
        e.setRegular(false);
        
        this.listaEstudiantes[this.totalEstudiantes] = e;
        this.totalEstudiantes+= 1;
    }
    public void agregarEstudiantes(String ap,String nom,int lu,String em){
        Estudiante e = new Estudiante(ap,nom,lu,em);
        this.listaEstudiantes[this.totalEstudiantes] = e;
        this.totalEstudiantes += 1;
        
    }
    private  void ordenarLista(){
        Estudiante aux;

       for(int i=0;i<this.totalEstudiantes-1;i++){
        
           for(int j=i+1;j<this.totalEstudiantes;j++){ 
            
             if(this.listaEstudiantes[i].getApellido().compareTo(this.listaEstudiantes[j].getApellido())>0){
                 aux=this.listaEstudiantes[i];
                 this.listaEstudiantes[i] = this.listaEstudiantes[j];
                 this.listaEstudiantes[j] = aux;
             }
        }
       }
    }
    public void mostrarLista(){
        ordenarLista();
        
        for(int i=0;i<this.totalEstudiantes;i++){
            System.out.println(this.listaEstudiantes[i].toString());
        }
    }
    public Estudiante buscarEstudiante(int lu){
        boolean ban = false;
        int i = 0;
        
        while(ban == false && i < this.totalEstudiantes){
            if(lu == this.listaEstudiantes[i].getLu()) ban = true;
            else i++;
        }
        if(ban == true) return this.listaEstudiantes[i];
        else return null;
    }
    
    public void regularizarEstudiantes(){
    
        int porcentaje;
        
        for(int i=0;i<this.totalEstudiantes;i++){
           
         porcentaje=((this.listaEstudiantes[i].getAsistencia())/this.getTotalClases())*100;
        if(this.listaEstudiantes[i].getNotaP1()>=60 && this.listaEstudiantes[i].getNotaP2()>=60 && porcentaje>=80) this.listaEstudiantes[i].setRegular(true);
        else if((this.listaEstudiantes[i].getNotaP1()>=60 || this.listaEstudiantes[i].getNotaP2()>=60) && this.listaEstudiantes[i].getNotaR()>=60 && porcentaje>=80) this.listaEstudiantes[i].setRegular(true);
        }
    
    }
    public void mostrarRegulares(){
        
        for(int i=0;i<this.totalEstudiantes;i++){
        
            if(this.listaEstudiantes[i].isRegular()==true) this.listaEstudiantes[i].toString();
        
        }
    }
    
}
