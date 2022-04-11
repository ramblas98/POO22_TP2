/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_ejemplo1;

/**
 *
 * @author profeblas
 */
public class Empleado {
    private     
            String nombre ;
    private
            int horas ;
    private 
            double valor ;

    public Empleado() {
        
    }

    public Empleado(String nombre, int horas, double valor) {
        this.nombre = nombre;
        this.horas = horas;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHoras() {
        return horas;
    }

    public double getValor() {
        return valor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public double calcularsueldo(){
        return this.horas*this.valor ;
                
    }
    
}
