/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author USUARIO 2020
 */
public class Persona {
    public String nombre, apellido;
    
    public Persona(String n, String a){
        nombre = n;
        apellido = a;
    }
    
    public void setNombre(String n){
        nombre = n;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setApellido(String a){
        apellido = a;
    }
    
    public String getApellido(){
        return apellido;
    }
    
}
