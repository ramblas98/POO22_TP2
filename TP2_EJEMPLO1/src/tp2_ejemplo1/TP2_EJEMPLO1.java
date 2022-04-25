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
        Scanner teclado = new Scanner(System.in);
        Empleado v[]; String nombre; int horas; double valor;
        
        System.out.println("Cantidad de empleados: ");
        int n = teclado.nextInt();
        v = new Empleado[n];
        
        for(i=0;i<n;i++){
            v[i] = new Empleado();
            System.out.println("Nombre del Empleado: ");
            //nombre = teclado.nextLine();
            v[i].setNombre(teclado.next());
            System.out.println("Horas trabajadas: ");
            horas = teclado.nextInt();
            v[i].setHoras(horas);
            System.out.println("Valor de horas trabajadas: ");
            valor = teclado.nextDouble();
            v[i].setValor(valor);
            System.out.println("El sueldo es: " + v[i].calcularSueldo());
        }
        
        
        
    }
    
}
