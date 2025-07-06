/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller10.Ejemplos;

/**
 *
 * @author Navid Lobato
 */
public class AnimalT10 {

    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }
}
// Clase derivada

class Perro extends AnimalT10 {

    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra.");
    }
}
