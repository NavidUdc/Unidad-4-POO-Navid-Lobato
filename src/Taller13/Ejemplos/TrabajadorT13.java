/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Taller13.Ejemplos;

/**
 *
 * @author Navid Lobato
 */
public interface TrabajadorT13 {

    void trabajar(); // Método abstracto

    default void tomarDescanso() {
        System.out.println("Tomando un descanso.");
    }
}

class Persona implements TrabajadorT13 {

    @Override
    public void trabajar() {
        System.out.println("Persona trabajando.");
    }
}
