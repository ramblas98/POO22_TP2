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
    private String nombre;
    private int horas;
    private double valor;
    
    Empleado(String nombre, int horas, double valor){
        setNombre(nombre);
        setHoras(horas);
        setValor(valor);
    }
    
    public void setNombre(String n){
        nombre = n;
    }
    
    public void setHoras(int h){
        horas = h;
    }
    
    public void setValor(double v){
        valor = v;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getHoras(){
        return horas;
    }
    
    public double getValor(){
        return valor;
    }
    
    public double calcularSueldo(){
        return horas*valor;
    }
    
    
}
