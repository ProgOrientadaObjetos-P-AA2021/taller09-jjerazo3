/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete1.Persona;
import paquete2.Prestamo;

/**
 *
 * @author reroes
 */
public class PrestamoAutomovil extends Prestamo {

    public String tipo, marca;
    public Persona garante;
    double valor, mensual;

    public PrestamoAutomovil(Persona persona, int meses, String ciudad, String t,
             String m, Persona p, double v, double c) {
        super(persona, meses, ciudad);
        tipo = t;
        marca = m;
        garante = p;
        valor = v;
        mensual = c;
    }


    public void setTipo(String t){
        tipo = t;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public void setMarca(String m){
        marca = m;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setGarante(Persona g){
        garante = g;
    }
    
    public Persona getGarante(){
        return garante;
    }
    
    public void seValor(double v){
        valor = v;
    }
    
    public double getValor(){
        return valor;
    }
    
    public void setMensualidad(){
        mensual = valor / meses;
    }
    
    public double getMensualidad(){
        return mensual;
    }
    
    
    @Override
    
    public void setCiudad(String ciudad){
        this.ciudad = ciudad.toLowerCase();
    }
    
    @Override
    public String toString(){
        String cadenaFinal = String.format("%s", super.toString());
        cadenaFinal = String.format("%s\n"
                + "Tipo de automovil: %s\n"
                + "Marca de automovil: %s\n"
                + "Informacion del garante: \n"
                + "  Nombre:%s\n"
                + "  Apellido:%s\n"
                + "Valor del automovil: %.2f\n"
                + "Valor mensual:  %.2f\n",
                cadenaFinal,
                tipo,
                marca,
                garante.getNombre(),
                garante.getApellido(),
                valor,
                mensual);
        
        return cadenaFinal;
    }
 
}
