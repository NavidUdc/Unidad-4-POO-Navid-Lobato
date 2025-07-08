/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller16.Ejercicios;

/**
 *
 * @author Navid Lobato
 */
public class DescuentoPorcentajeT16 implements DescuentoT16 {
     private double porcentaje; 

    public DescuentoPorcentajeT16(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double aplicarDescuento(double precio) {
        return precio * (1 - porcentaje);
    }
}
