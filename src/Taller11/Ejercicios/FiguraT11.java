/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller11.Ejercicios;

/**
 *
 * @author Navid Lobato
 */
public abstract class FiguraT11 {
    public abstract double calcularArea(); 

    public void mostrarArea() { 
        System.out.println("Área: " + calcularArea());
    }
}
