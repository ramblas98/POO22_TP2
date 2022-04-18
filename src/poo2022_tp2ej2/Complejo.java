/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2022_tp2ej2;
import java.util.Scanner;
/**
 *
 * @author leonardo
 */
public class Complejo {
    
    private double re;
    private double im;

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    public Scanner getTeclado() {
        return teclado;
    }

    public Complejo getC() {
        return c;
    }

    public int getOpc() {
        return opc;
    }

    public int getA() {
        return a;
    }

    public void setRe(double re) {
        this.re = re;
    }

    public void setIm(double im) {
        this.im = im;
    }

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }

    public void setC(Complejo c) {
        this.c = c;
    }

    public void setOpc(int opc) {
        this.opc = opc;
    }

    public void setA(int a) {
        this.a = a;
    }
    
    
    
        Scanner teclado = new Scanner(System.in);
      //  System.out.println("Ingresar numeros del 1 al 11");
        Complejo c;
        
             
       int opc;
        do{     
        // TODO code application logic here
        
       System.out.println("COMPLEJOS");
       System.out.println("Ingresar numeros del 1 al 11");
      System.out.println("Ingresar numero del 1 para incrementar");
      System.out.println("Ingresar numero del 2 decrementar");
      System.out.println("Ingresar numero del 3 producto");
      System.out.println("Ingresar numero del 4 porducto doube ");
      System.out.println("Ingresar numero del 5 div ");
      System.out.println("Ingresar numero del 6 modulo");
      System.out.println("Ingresar numero del 7 conjugado");
      System.out.println("Ingresar numero del 8 sumer 2 complejos");
      System.out.println("Ingresar numero del 9 restar 2 complejos");
      System.out.println("Ingresar numero del 10 producto de 2 complejos");
      System.out.println("Ingresar numero del 11 division de 2 complejo");
      opc = teclado.nextInt();
      
       switch (opc){
           case 0: System.out.println("SALIR");
              break;
           case 1:   System.out.println("ingresar parte real");
                    c.setRe(teclado.nextDouble());
           System.out.println("ingresar parte imaginaria");
           c.setIm(teclado.nextDouble());
                     System.out.println("ingresar numero A");
                     int a=teclado.nextInt();
                     
               incrementar(c,a);
                     
               break;
        
           case 2 : ();
                break;
    
           case 3: ();
                break;
           case 4: ();
                break;
                

}
       public static  void incrementar(Complejo c; int a){
       c.getRe()+a
       c.getIm()+a
       }
}



}