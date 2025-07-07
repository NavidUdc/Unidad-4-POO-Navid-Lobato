/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller14.Ejemplos;

/**
 *
 * @author Navid Lobato
 */
public class EmpleadoT14 {

    public void trabajar() {
        System.out.println("El empleado está trabajando.");
    }
}
// Clases derivadas

 class Gerente extends EmpleadoT14 {

    @Override
    public void trabajar() {
        System.out.println("El gerente está gestionando el equipo.");
    }
}

 class Ingeniero extends EmpleadoT14 {

    @Override
    public void trabajar() {
        System.out.println("El ingeniero está diseñando.");
    }
}
// Clase de prueba
 class Main {

    public static void main(String[] args) {
        EmpleadoT14 empleado1 = new Gerente();
        EmpleadoT14 empleado2 = new Ingeniero();
        empleado1.trabajar(); // Muestra: El gerente está gestionando el equipo.
        empleado2.trabajar(); // Muestra: El ingeniero está diseñando.
    }
}
