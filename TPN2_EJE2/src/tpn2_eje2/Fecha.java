/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpn2_eje2;

/**
 *
 * @author alumno
 */
public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha() {
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    
    
    
    public void reiniciar(int d, int m, int a){
    this.dia=d;
    this.mes=m;
    this.anio=a;
        
   public void adelantar (int d){
     this.setDia(this.dia+d);
    
    }
    public boolean valida(){

    if(this.dia>1 && this.dia<30 && this.mes >1 && this.mes<13)
        return true;
        else
    return false;
    }
public void normalizar(){


}
public void dias(int m){

}
public void implimir(){

}
public boolean bisiesto(int a){
     if(a %400==0)
         if(a%4==0)
             if(a%100 !=0)
              return true;
     else
        return false;
        return false;
                 }
       

}
