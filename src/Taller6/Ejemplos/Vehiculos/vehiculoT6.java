/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller6.Ejemplos.Vehiculos;

/**
 *
 * @author Navid Lobato
 */
public class vehiculoT6 {

    protected String marca;
    protected double velocidad;

    public vehiculoT6(String marca, double velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
    }

    protected void mostrarDetalles() {
        System.out.println("Marca: " + marca + ", Velocidad: " + velocidad + " km/h");
    }
}
