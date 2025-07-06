/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller5.Ejercicios;

/**
 *
 * @author Navid Lobato
 */
public class ProductoEjericioT5 {
    
    String nombre;
    double precio;
    int stock;

    public ProductoEjericioT5() {
        this.nombre = "Nutella";
        this.precio = 2500;
        this.stock = 20;
    }
    
    public void mostrarInfo (){
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Stock: " + stock);
    }
}
