/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_ejercicio.pkg4;

/**
 *
 * @author alumno
 */
public class ListaEnlazada {
    private Nodo inicio;

    public ListaEnlazada() {
        this.inicio = null;
    }
    
    public ListaEnlazada(Nodo inicio) {
        this.inicio = inicio;
    }

    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }
    
    public boolean esVacia(){
        if(this.inicio == null)return true;
        else return false;
    }
    public int cantidadNodos(){
        Nodo i; 
        i = this.inicio;
        int can = 0;
        
        while(i != null){
            can+= 1;
            //no se reconoce a i como tipo Nodo
        }
        
        return can;
    }
}
