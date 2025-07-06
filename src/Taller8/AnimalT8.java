/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller8;

/**
 *
 * @author Navid Lobato
 */
public class AnimalT8 {

    protected String especie;

    public AnimalT8(String especie) {
        this.especie = especie;
    }

    public void emitirSonido() {
        System.out.println("El animal hace un sonido.");
    }

    public void mostrarEspecie() {
        System.out.println("Especie: " + especie);
    }
}
// Clase derivada
 class Perro extends AnimalT8 {

    private String raza;

    public Perro(String especie, String raza) {
        super(especie); // Llama al constructor de la clase base
        this.raza = raza;
    }

    public void ladrar() {
        System.out.println("El perro ladra.");
    }

    @Override
    public void emitirSonido() {
        System.out.println("El perro ladra.");
    }
}
