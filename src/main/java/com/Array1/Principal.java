package com.Array1;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        String nombre;
        int edad;
        String carrera;
        int curso;
        String respuesta;

        // El array va a tener 20 posiciones
        Empleado[] empleados;
        empleados = new Empleado[20];

        // Voy a crear un Scanner
        Scanner entrada = new Scanner(System.in);
        Boolean seguir = true;
        int i = 0;

        while (seguir) {
            System.out.print("El nombre del empleado es: ");
            nombre = entrada.nextLine();
            System.out.print("La edad del empleado es: ");
            edad = entrada.nextInt();
            System.out.println("La persona que está dada de alta es estudiante: ");
            respuesta = entrada.nextLine();

            if (respuesta.equals("si")) {
                System.out.print("El estudiante estudia la carrera de: ");
                carrera = entrada.nextLine();
                System.out.print("El estudiante cursa: ");
                curso = entrada.nextInt();
                entrada.nextLine();
                empleados[i] = new Estudiante(nombre, edad, carrera, curso);
            } else if (respuesta.equalsIgnoreCase("No")) {
                empleados[i] = new Empleado(nombre, edad);
            }
            System.out.println("Quiere introducir mas empleados: ");
            if (entrada.nextLine().equalsIgnoreCase("no")) {
                seguir = false;
            }
            i++;
        }

        for (i=0; i<empleados.length; i++){
            System.out.println(empleados[i]);
        }
        entrada.close();
    }
}
