/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller15.Ejercicios;

/**
 *
 * @author Navid Lobato
 */
public class PrecioService {
     public double calcularConIVA(ProductoT15 producto) {
        return producto.getPrecio() * 1.19;
    }
}
