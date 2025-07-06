/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller6.Ejercicios;

/**
 *
 * @author Navid Lobato
 */
public class VehiculoT6 {

    protected String tipo;
    protected String marca;

    public VehiculoT6(String tipo, String marca) {
        this.tipo = tipo;
        this.marca = marca;
    }
}

// Subclase
class Moto extends VehiculoT6 {

    private int cilindrada;

    public Moto() {
        super("Mkd", "Akt");
        this.cilindrada = 155;
    }

    public void mostrarDetalles() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Marca: " + marca);
        System.out.println("Cilindrada: " + cilindrada + "cc");
    }
}

class AccesoInvalido {

    public void probarAcceso() {
        VehiculoT6 vehiculo = new VehiculoT6("Auto", "Toyota");
        // Esto causará error de compilación porque tipo y marca son protected
        // y AccesoInvalido no es una subclase ni del mismo paquete si estuvieran separados.
    }
}
