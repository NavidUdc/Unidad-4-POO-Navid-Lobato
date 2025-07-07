/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller11.Ejemplos;

/**
 *
 * @author Navid Lobato
 */
public abstract class EmpleadoT11 {

    protected String nombre;

    public EmpleadoT11(String nombre) {
        this.nombre = nombre;
    }

    public abstract void calcularSalario(); // Método abstracto

    public void mostrarNombre() {
        System.out.println("Nombre: " + nombre);
    }
}

class Gerente extends EmpleadoT11 {

    private double bono;

    public Gerente(String nombre, double bono) {
        super(nombre);
        this.bono = bono;
    }

    @Override
    public void calcularSalario() {
        System.out.println("El salario del gerente incluye un bono de: " + bono);
    }
}
