/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_ejemplo1;
import java.util.Scanner;

/**
 *
 * @author profeblas
 */
public class TP2_EJEMPLO1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Empleado v [] = new Empleado[20];    
   
    Scanner teclado = new Scanner(System.in);
    System.out.println("INDICAR LA CANTIDAD DE EMPLEADOS A REGISTRAR");
    int n=teclado.nextInt();
    
       for(int i=0;i<n;i++) {
       System.out.println("INGRESE EL NOMBRE EMPLEADO ");
         v[i] = new Empleado();
         v[i].setNombre( teclado.next()  );//;
         System.out.println("INGRESE LAs HORAS QUE TRABAJO EMPLEADO ");
         v[i].setHoras(teclado.nextInt());
         System.out.println("INGRESE EL SUELDO POR HORA");
          v[i].setValor(teclado.nextDouble());
       
       System.out.println("SUELDO es "+ v[i].calcularSueldo());
       }
    
    }
    //CREAR UN SUELDO DE CADA UNO
    
    
    //IMPRIMIR EL SUELDO DE CADA UNO
}
