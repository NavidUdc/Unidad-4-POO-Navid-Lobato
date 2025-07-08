/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller16.Ejercicios;

/**
 *
 * @author Navid Lobato
 */
public class DescuentoFijo implements DescuentoT16{
    private double valorFijo;

    public DescuentoFijo(double valorFijo) {
        this.valorFijo = valorFijo;
    }

    public double aplicarDescuento(double precio) {
        return precio - valorFijo;
    }
}
