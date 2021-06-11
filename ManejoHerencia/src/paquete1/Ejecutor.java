/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Scanner;
import paquete2.Prestamo;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        boolean exit = false;
        boolean Incorrecto = false;
        int mesesPrestamo = 0;
        String nombres;
        String apellidos;
        String ciudad = null;
        
        Persona persona = null;
        PrestamoEducativo prestamo = null;
        PrestamoAutomovil prestamoa =null;
        
        //Bucle hasta que se seleccione salir
        do {
            System.out.println("--- Menu de Prestamos ---");
            System.out.println("1.Prestamo educativo");
            System.out.println("2.Prestamo automovil");
            System.out.println("3.Salir");
            System.out.print("...............................");
            String option = read.nextLine();
            
            //Se elimina espacios y mayúsculas
            option.toLowerCase();
            option.trim();
            System.out.println("-----------------------");

            
            //Evita que se pida el ingreso de datos nuevamente en caso de 
            //una opción incorrecta
            if (Incorrecto != true) {
                System.out.print("Nombres: ");
                nombres = read.nextLine();
                System.out.print("Apellidos: ");
                apellidos = read.nextLine();
                persona = new Persona(nombres, apellidos);
                System.out.print("Meses del prestamo: ");
                mesesPrestamo = Integer.parseInt(read.nextLine());
                System.out.print("Ciudad: ");
                ciudad = read.nextLine();

            }

            switch (option) {
                case "1":

                    System.out.print("Nivel Estudio:");
                    String nivelEstudio = read.nextLine();
                    System.out.print("Nombre centro educativo: ");
                    String nombreCentroEducativo = read.nextLine();
                    System.out.print("Valor Carrera: ");
                    double valorCarrera = read.nextDouble();
                    double mensualCarrera = valorCarrera/mesesPrestamo;
                    System.out.printf("Valor Mensual: %.2f", mensualCarrera );
                    System.out.println("\n");
                    prestamo = new PrestamoEducativo(persona, mesesPrestamo,
                            ciudad, nivelEstudio, nombreCentroEducativo,
                            valorCarrera, mensualCarrera);
                    prestamo.getMensualCarrera();
                    Incorrecto = true;

                    break;
                case "2":
                    System.out.print("Tipo de automovil: ");
                    String tipoAutomovil = read.nextLine();
                    System.out.print("Marca del automovil: ");
                    String marcaAutomovil = read.nextLine();
                    System.out.print("Valor del automovil: ");
                    double valorAutomovil = Double.parseDouble(read.nextLine());
                    double valorMensual = valorAutomovil/mesesPrestamo;
                    System.out.printf("Valor mensual: %.2f", valorMensual);
                    System.out.println("\n");
                    System.out.print("Datos del garante ->\n");
                    System.out.print(" Nombres: ");
                    String nombresGarante = read.nextLine();
                    System.out.print(" Apelllidos: ");
                    String apellidosGarante = read.nextLine();

                    Persona garante = new Persona(nombresGarante, apellidosGarante);

                    prestamoa = new PrestamoAutomovil(persona,
                            mesesPrestamo, ciudad, tipoAutomovil, marcaAutomovil,
                            garante, valorAutomovil, valorMensual);
                    prestamoa.getMensualidad();
                    Incorrecto = true;

                    break;

                case "3":
                    exit = true;
                    break;
                default:
                    System.out.println("opcion invalida");
                    Incorrecto = true;
                    break;
            }

            System.out.println(prestamo);

        } while (exit == false);

    }

}
