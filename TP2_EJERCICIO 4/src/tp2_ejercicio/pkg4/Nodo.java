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
public class Nodo {
    private int dato;
    private Nodo sgte;

    public Nodo() {
        this.dato = 0;
        this.sgte = null;
                
    }
    
    public Nodo(int dato, Nodo sgte) {
        this.dato = dato;
        this.sgte = sgte;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSgte() {
        return sgte;
    }

    public void setSgte(Nodo sgte) {
        this.sgte = sgte;
    }
    
    public boolean ultimo(){
        return this.sgte == null;
    }
    public static Nodo buscarUltimo(Nodo inicio){
        Nodo aux = inicio;
        Nodo ant = null;
        while(aux.sgte != null){
            ant = aux;
            aux = aux.sgte;
        }
        return ant;
    }
    public static Nodo buscarSiguiente(Nodo inicio, int elem){
        Nodo i = inicio;
        boolean ban =false;
        while(i.sgte != null && ban == false){
            if(i.dato == elem) ban = true;
            else i = i.sgte;
        }
        if (ban == false)return null;
        else return i;
    }
    public static Nodo buscarAnterior(Nodo inicio, int elem){
        Nodo i = inicio;
        Nodo ant = null;
        boolean ban =false;
        
        while(i.sgte != null && i.dato != elem){
            ant = i;
            i = i.sgte;
        }
        if (i.dato == elem )return ant;
        else return null;
    }
    public static Nodo buscarUltimoMenor(Nodo inicio, int elem){
        Nodo i = inicio;
        Nodo x = null;
        
        while(i != null){
            if(i.dato < elem) x = i;
            i = i.sgte;
        }
        return x;
    }
    public static Nodo buscarUltimoMayor(Nodo inicio, int elem){
        Nodo i = inicio;
        Nodo x = null;
        
        while(i != null){
            if(i.dato > elem) x = i;
            i = i.sgte;
        }
        return x;
    }
}
