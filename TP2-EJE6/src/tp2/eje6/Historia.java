/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2.eje6;

/**
 *
 * @author alumno
 */
public class Historia {
    private int id;
    private static int nh;// atributo de clase
    private String codigo;
    private enum estado{ocupado,disponible};
    private enum especialidadRequerida{familia,traumatologia,pediatria,internista,otorrino};
    private Medico medicoAsignado;
    private boolean alta;

    public String getCodigo() {
        return codigo;
    }

    public void setMedicoAsignado(Medico medicoAsignado) {
        this.medicoAsignado = medicoAsignado;
    }
    
   public void dar_alta(){
    
    }
    public void equals(){
    
    }

