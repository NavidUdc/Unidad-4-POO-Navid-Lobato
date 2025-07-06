/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller6.Ejemplos.Animales;

/**
 *
 * @author Navid Lobato
 */
public class Perro extends Animal {

    public Perro(String especie) {
        super(especie);
    }

    @Override
    protected void emitirSonido() {
        System.out.println("El perro ladra.");
    }

}
