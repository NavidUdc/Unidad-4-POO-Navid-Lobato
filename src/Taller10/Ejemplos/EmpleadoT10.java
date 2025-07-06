/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller10.Ejemplos;

/**
 *
 * @author Navid Lobato
 */
public class EmpleadoT10 {

    public void trabajar() {
        System.out.println("El empleado está trabajando.");
    }
}
// Clase derivada

class Gerente extends EmpleadoT10 {

    @Override
    public void trabajar() {
        System.out.println("El gerente está gestionando el equipo.");
    }
}

