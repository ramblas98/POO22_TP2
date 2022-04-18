/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_ejemplo1;

/**
 *
 * @author alumno
 */
public class Complejo {
    private double re;
    private double im;
    
    public Complejo(){
        
    }
    public Complejo(double re, double im){
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public void setRe(double re) {
        this.re = re;
    }

    public double getIm() {
        return im;
    }

    public void setIm(double im) {
        this.im = im;
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
    public void por(double d){
        this.re = this.re * d;
        this.im = this.im * d;
    }
    public void div(Complejo a){
        this.re = (((this.re * a.re) + (this.im * a.im)) / ((a.re*a.re)+(a.im*a.im)));
        this.im = (((this.im * a.re) - (this.re * a.im)) / ((a.re*a.re)+(a.im*a.im)));
    }
    public double modulo(){
        return(Math.sqrt(Math.pow(im,2) + Math.pow(re,2)));
    }
     public Complejo conjugado(){
        Complejo z = new Complejo();
        z.re = this.re;
        z.im = (-1)*this.im;
        
        return z;
    }
}
