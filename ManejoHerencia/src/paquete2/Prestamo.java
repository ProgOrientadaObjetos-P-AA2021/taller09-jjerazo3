/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.Persona;

/**
 *
 * @author reroes
 */
public class Prestamo {

    protected Persona persona;
    protected int meses;
    protected String ciudad;

    public Prestamo(Persona persona, int meses, String ciudad) {
        this.ciudad = ciudad;
        this.meses = meses;
        this.persona = persona;
    }

    public void setPersona(Persona p) {
        persona = p;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setMeses(int m) {
        meses = m;
    }

    public int getMeses() {
        return meses;
    }

    public void setCiudad(String c) {
        ciudad = c;
    }

    public String getCiudad() {
        return ciudad;
    }

    @Override
    public String toString() {
        String cadena = String.format("Datos del beneficiario:\n Nombre: %s\n"
                + "Apellido: %s\n"
                + "Tiempo del prestamo: %d meses.\n"
                + "Ciudad: %s\n",
                persona.getNombre(),
                persona.getApellido(),
                meses,
                ciudad);

        return cadena;
    }
}
