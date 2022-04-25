/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_ejercicio1;

/**
 *
 * @author Matias
 */
public class Complejo {
    private double re;
    private double im;
    
    public Complejo(){
        
    }
    
    public Complejo(double real, double imag){
        this.re = real;
        this.im = imag;
    }
    
    public double getReal() {
        return re;
    }
    public double getImag() {
        return im;
    }

    public void setReal(double real) {
        this.re = real;
    }
    public void setImag(double imag) {
        this.im = imag;
    }
    
    public void inc(Complejo a){
        this.re += a.re;
        this.im += a.im;
    }
    public void dec(Complejo a){
        this.re -= a.re;
        this.im -= a.im;
    }
    public void por(Complejo a){
        this.re = (this.re * a.re)-(this.im * a.im);
        this.im = (this.re * a.im)+(this.im * a.re);
    }
    
     public Complejo conjugado(){
        Complejo c = new Complejo();
        c.re = this.re;
        c.im = this.im*(-1);
        
        return c;
    }
    
}
