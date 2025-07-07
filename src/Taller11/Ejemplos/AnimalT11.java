/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller11.Ejemplos;

/**
 *
 * @author Navid Lobato
 */
public abstract class AnimalT11 {

    protected String nombre;
// Constructor

    public AnimalT11(String nombre) {
        this.nombre = nombre;
    }
// Método abstracto (sin cuerpo)

    public abstract void hacerSonido();
// Método concreto

    public void mostrarNombre() {
        System.out.println("Nombre: " + nombre);
    }
}
// Definición de una clase derivada

 class Perro extends AnimalT11{

    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra.");
    }

}
