/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_ejercicio.pkg2;

/**
 *
 * @author  Danie
 */
public class Fecha {
    private int dias;
    private int mes;
    private int anio;
    
    public Fecha(){
        this.dias = 0;
        this.mes = 0;
        this.anio = 0000;
    }

    public Fecha(int dias, int mes, int anio) {
        this.dias = dias;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    public void Reiniciar(int d,int m,int a ){
        this.dias = d;
        this.mes = m;
        this.anio = a;
    }
    public void Normalizar(){
        while(Validar() == true){
            //Mal Dias 
            if (this.dias > Dias(this.mes)){
                this.dias = this.dias - Dias(this.mes);
                if((this.mes + 1) >= 1 || (this.mes + 1) <= 12){
                    this.mes += 1;
                }
                else{
                    this.mes = 1;
                    this.anio += 1;
                }
            }
        }
        
    }
    public void Adelantar(int dia){
        this.dias = this.dias + dia;
        if(Validar() == false) Normalizar();
    }
    public void Imprimir(){
        System.out.println(this.dias + "/" + this.mes + "/" + this.anio);
    }
    public boolean Bisiesto(int anio){
        return(anio/400 == 0 || anio/4 == 0  && anio/100 != 0);
    }
    public int Dias(int m){
        if(m == 2)return 28;
        else{
            if(m == 6 || m == 9 || m == 11 )return 30;
            else{
                if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)return 31;
            }
        }
        return 0;
    }
    public boolean Validar(){
        if(Bisiesto(this.anio) == true) return (this.mes == 2 && this.dias < 0 || this.dias > 29);
        else return (this.dias <= Dias(this.mes) && this.mes >= 1 || this.mes <= 12 );
    }
}
