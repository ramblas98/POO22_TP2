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

    public static Complejo suma(Complejo a , Complejo b){
        Complejo z = new Complejo();
        z.inc(a);
        z.inc(b);
        return z;
    }
    public static Complejo resta(Complejo a, Complejo b){
        Complejo z = new Complejo();
        z.dec(a);
        z.dec(b);
        return z;
    }
    public static Complejo producto(Complejo a, Complejo b){
        Complejo z = new Complejo();
        z.por(a);
        z.por(b);
        return z;
    }
    public static Complejo division(Complejo a, Complejo b){
        Complejo z = new Complejo();
        z.div(a);
        z.div(b);
        return z;
    }
    public static Complejo porEscalar(Complejo a, double b){
        Complejo z = new Complejo();
        z.por(a);
        z.por(b);
        return z;
    
    }
    public static void menu(){
    
        System.out.println("**********MENU*********");
        System.out.println("[1] SUMAR");
        System.out.println("[2] RESTAR");
        System.out.println("[3] MULTIPLICAR");
        System.out.println("[4] DIVIDIR");
        System.out.println("[5] CONJUGADO");
        System.out.println("[6] PROD. POR ESCALAR");
        System.out.println("[7] MODULO");
        System.out.println("[8] SALIR");
        System.out.println("ELECCION= ");
    
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        Complejo c1,c2;
        double a,b,r;
        int op;
        
        System.out.println("CARGA DEL COMPLEJO c1");
        System.out.println("PARTE REAL = ");
        a=teclado.nextInt();
        System.out.println("PARTE IMAGINARIA = ");
        b=teclado.nextInt();
        c1 = new Complejo(a,b);
        
        System.out.println("CARGA DEL COMPLEJO c2");
        System.out.println("PARTE REAL = ");
        a=teclado.nextInt();
        System.out.println("PARTE IMAGINARIA = ");
        b=teclado.nextInt();
        c2 = new Complejo(a,b);
        
        menu();
        op=teclado.nextInt();
        while(op!=8){
        
            switch(op){
        
                case 1:     suma(c1,c2).mostrar();
                            System.out.println();
                break;
       
                case 2:     resta(c1,c2).mostrar();
                            System.out.println();
                break;
                
        
                case 3:     producto(c1,c2).mostrar();
                            System.out.println();
                break;
        
                case 4:     division(c1,c2).mostrar();
                            System.out.println();
                break;
        
                case 5:     
                            c1.conjugado().mostrar();
                            System.out.println();
                            c2.conjugado().mostrar();
                            System.out.println();
                break;
                
                case 6:    a=teclado.nextInt();
                           porEscalar(c1,a).mostrar();
                           porEscalar(c2,a).mostrar();
                
                break;
                
                case 7:    r=c1.modulo();
                           System.out.println(r);
                           r=c2.modulo();
                           System.out.println(r);
                break;
            }
        menu();
        op=teclado.nextInt();
        
        }
        
    }
    
}
