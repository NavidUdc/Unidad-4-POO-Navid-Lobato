/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller5.Ejemplos;

/**
 *
 * @author Navid Lobato
 */
public class ProductoT5 {

    String nombre; // Atributo de paquete (default)
    double precio; // Atributo de paquete (default)

    ProductoT5(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Precio: " + precio);
    }

}
