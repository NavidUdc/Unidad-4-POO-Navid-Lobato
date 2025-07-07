/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller12.Ejercicios;

/**
 *
 * @author Navid Lobato
 */
public class PersonaT12 implements Trabajador, Hablador {
     private String nombre;

    public PersonaT12(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void hablar() {
        System.out.println("La persona esta hablando");
    }

    @Override
    public void trabajar() {
        System.out.println("La persona esta hablando");
    }

}
