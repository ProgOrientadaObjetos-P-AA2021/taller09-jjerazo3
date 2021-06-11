/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import paquete1.Persona;
import paquete2.Prestamo;

/**
 *
 * @author reroes
 */
public class PrestamoEducativo extends Prestamo {

    public String nivel, nombreCentro;
    public double valorCarrera, mensualCarrera;

    public PrestamoEducativo(Persona persona, int meses, String ciudad, String 
            n, String nom, double vc, double mc) {
        super(persona, meses, ciudad);
        nivel = n;
        nombreCentro = nom;
        valorCarrera = vc;
        mensualCarrera = mc;
    }

    public void setNivel(String n) {
        nivel = n;
    }

    public String getNivel() {
        return nivel;
    }

    public void setCentro(String c) {
        nombreCentro = c;
    }

    public String getCentro() {
        return nombreCentro;
    }

    public void setValorCarrera(double v) {
        valorCarrera = v;
    }

    public double getValorCarrera() {
        return valorCarrera;
    }

    public void setMensualCarrera() {
        valorCarrera= (valorCarrera / super.meses) - ((valorCarrera /
                super.meses) * 0.10);    }
    
    public double getMensualCarrera(){
        return mensualCarrera;
    }
    
    @Override
    
    public void setCiudad(String ciudad){
        this.ciudad = ciudad.toUpperCase();
    }
    
    @Override
    public String toString(){
        String cadenaFinal = String.format("%s", super.toString());
        cadenaFinal = String.format("%s\n"
                + "Nivel de estudio: %s\n"
                + "Nombre del Centro Educativo: %s\n"
                + "Valor de la carrera: %.2f\n"
                + "Valor mensual del prestamo:  %.2f\n",
                cadenaFinal,
                nivel,
                nombreCentro,
                valorCarrera,
                mensualCarrera);
        
        return cadenaFinal;
    }

}
