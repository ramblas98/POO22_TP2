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
        Scanner teclado = new Scanner (System.in);
        
        System.out.print("ingrese la cantidad de empleado");
        int n = teclado.nextInt(); 
        Empleado v [];
        v = new Empleado[n];
        for (int i =0 ;i<n;i++){
            v[i]=new Empleado();
            System.out.print("nombre");
            v[i].setNombre(teclado.next());
            System.out.print("horas");
            v[i].setHoras(teclado.nextInt());
            System.out.print("valor");
            v[i].setValor(teclado.nextDouble());
            System.out.println("sueldo:"+v[i].calcularsueldo());
        }
    }
    
}
