/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller14.Ejercicios;

/**
 *
 * @author Navid Lobato
 */
public class RectanguloT14 extends FiguraT14{
    private double base, altura;

    public RectanguloT14(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        double area = base * altura;
        System.out.println("Área del rectángulo: " + area);
    }
}
