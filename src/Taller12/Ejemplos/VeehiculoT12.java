/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Taller12.Ejemplos;

/**
 *
 * @author Navid Lobato
 */
public interface VeehiculoT12 {

    void acelerar();

    default void encender() {
        System.out.println("El vehículo está encendido.");
    }
}
// Clase Coche que implementa la interfaz Vehiculo

class Coche implements VeehiculoT12 {

    @Override
    public void acelerar() {
        System.out.println("El coche está acelerando.");
    }
}

