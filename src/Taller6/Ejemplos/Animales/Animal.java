/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller6.Ejemplos.Animales;

/**
 *
 * @author Navid Lobato
 */
public class Animal {

    protected String especie;

    public Animal(String especie) {
        this.especie = especie;
    }

    protected void emitirSonido() {
        System.out.println("El animal hace un sonido.");
    }
}
