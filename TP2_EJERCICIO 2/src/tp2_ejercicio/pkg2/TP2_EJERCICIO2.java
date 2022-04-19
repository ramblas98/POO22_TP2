/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_ejercicio.pkg2;

/**
 *
 * @author Daniel
 */
public class TP2_EJERCICIO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fecha f = new Fecha(31,1,2020);
        f.Adelantar(29);
        System.out.println("Validar 1..........."+f.Validar());
        f.Imprimir();
    }
    
}
