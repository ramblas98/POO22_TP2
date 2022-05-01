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

    public boolean esVacia() {
        if (this.inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public int cantidadNodos() {
        Nodo i;
        i = this.inicio;
        int can = 0;

        while (i != null) {
            can += 1;
            i = i.getSgte();
            //no se reconoce a i como tipo Nodo
        }

        return can;
    }

    public void agregarPrimero(int dato) {
        Nodo nuevo = new Nodo(dato,null);
        
        if(esVacia() == false){
            nuevo.setSgte(this.inicio);
            this.inicio = nuevo;
        }
        else this.inicio = nuevo;
        
    }
    public void agregarUltimo(int dato){
        Nodo i = this.inicio;
        Nodo nuevo = new Nodo(dato,null);
        
        if(esVacia() == false){
            while(i.getSgte() != null){
                i = i.getSgte();
            }
            i.setSgte(nuevo);
        }
        else this.inicio = nuevo;
    }
    public void agregarMayor(int dato){
        Nodo nuevo = new Nodo(dato,null);
        Nodo mayor = Nodo.buscarUltimoMayor(this.inicio, dato);
        
        if(esVacia() == false){
            nuevo.setSgte(mayor.getSgte());
            mayor.setSgte(nuevo);
        }
        else this.inicio = nuevo;
        
    }
    public void agregarMenor(int dato){
        Nodo nuevo = new Nodo(dato,null);
        Nodo menor = Nodo.buscarUltimoMenor(this.inicio, dato);
        
        if(esVacia() == false){
            nuevo.setSgte(menor.getSgte());
            menor.setSgte(nuevo);
        }
        else this.inicio = nuevo;
    }
    public int eliminar(int dato){
        Nodo anterior = null;
        Nodo i = this.inicio;
        int cont = 0;
        
        while(i != null){
            if(i.getDato() == dato){
                cont += 1;
                //principio de la lista
                if(anterior == null){
                    this.inicio = i.getSgte();
                }
                else{
                    //en medio de la lista
                    anterior.setSgte(i.getSgte());
                }
                //final de la lista
                if(i.getSgte() == null){
                    anterior.setSgte(null);
                }
            }
            anterior = i;
            i = i.getSgte();
            
        }
        return cont;
    }
    public void mostrar(){
        Nodo i = this.inicio;
        
        while(i != null){
            System.out.print("|" + i.getDato() + "|");
        }
        System.out.println();
    }
    public int cambiarValor(int datoActual, int datoNuevo){
        Nodo i = this.inicio;
        int cont = 0;
        
        while(i != null){
            if(i.getDato() == datoActual){
                cont += 1;
                i.setDato(datoNuevo);
            }
            i = i.getSgte();
        }
        return cont;
    }
}
