/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller11.Ejercicios;

/**
 *
 * @author Navid Lobato
 */
public abstract class EmpleadoT11 {
    protected String nombre;

    public EmpleadoT11(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularSalario(); 
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + calcularSalario());
    }
}
