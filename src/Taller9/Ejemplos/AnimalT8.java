/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller9.Ejemplos;

/**
 *
 * @author Navid Lobato
 */
public class AnimalT8 {

    protected String especie;

    public AnimalT8(String especie) {
        this.especie = especie;
    }

    public void mostrarEspecie() {
        System.out.println("Especie: " + especie);
    }
}

class Gato extends AnimalT8 {

    private String color;

    public Gato(String especie, String color) {
        super(especie); // Llama al constructor de la clase base
        this.color = color;
    }

    @Override
    public void mostrarEspecie() {
        super.mostrarEspecie(); // Llama al método de la clase base
        System.out.println("Color: " + color);
    }
}

