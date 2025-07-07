/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller14.Ejemplos;

/**
 *
 * @author Navid Lobato
 */
public class VeihiculoT14 {

    public void mover() {
        System.out.println("El vehículo se está moviendo.");
    }
}

class Coche extends VeihiculoT14 {

    @Override
    public void mover() {
        System.out.println("El coche se está moviendo.");
    }
}

 class Bicicleta extends VeihiculoT14 {

    @Override
    public void mover() {
        System.out.println("La bicicleta se está moviendo.");
    }
}
