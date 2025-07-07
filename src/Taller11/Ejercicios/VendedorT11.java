/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller11.Ejercicios;

/**
 *
 * @author Navid Lobato
 */
public class VendedorT11 extends EmpleadoT11 {
     private double ventas;

    public VendedorT11(String nombre, double ventas) {
        super(nombre);
        this.ventas = ventas;
    }

    @Override
    public double calcularSalario() {
        return 500 + ventas * 0.2; 
    }
}
