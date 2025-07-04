/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller2.Ejemplos;

/**
 *
 * @author Navid Lobato
 */
public class Coche1 {

    private String marca;

    public Coche1(String marca) {
        this.marca = marca; // Usamos `this` para referirnos al atributo de la clase
    }

    public void setMarca(String marca) {
        this.marca = marca; // Usamos `this` para evitar la confusión entre el atributo y el parámetro
    }

    public void mostrarMarca() {
        System.out.println("Marca: " + this.marca);
    }
}
