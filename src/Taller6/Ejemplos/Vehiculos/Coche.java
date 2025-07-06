/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller6.Ejemplos.Vehiculos;

/**
 *
 * @author Navid Lobato
 */
public class Coche extends vehiculoT6 {
    
    private int puertas;

    public Coche(String marca, double velocidad, int puertas) {
        super(marca, velocidad);
        this.puertas = puertas;
    }

    public void mostrarInformacion() {
        mostrarDetalles(); // Accede al método protegido de la clase base
        System.out.println("Número de puertas: " + puertas);
    }

}
