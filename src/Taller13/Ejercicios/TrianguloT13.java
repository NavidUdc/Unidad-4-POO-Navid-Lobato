/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller13.Ejercicios;

/**
 *
 * @author Navid Lobato
 */
public class TrianguloT13 extends FiguraT13{
    private double base;
    private double altura;

    public TrianguloT13(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}
