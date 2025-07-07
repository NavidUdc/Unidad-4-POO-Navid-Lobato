/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller13.Ejemplos;

/**
 *
 * @author Navid Lobato
 */
public abstract class FiguraT13 {

    public abstract double calcularArea(); // Método abstracto

    public void mostrarFigura() {
        System.out.println("Mostrando figura.");
    }
}
// Clase derivada

class Circulo extends FiguraT13 {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
