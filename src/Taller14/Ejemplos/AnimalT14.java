/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller14.Ejemplos;

/**
 *
 * @author Navid Lobato
 */
public class AnimalT14 {

    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }
}
// Clase derivada

class Perro extends AnimalT14 {

    public void correr() {
        System.out.println("El perro está corriendo.");
    }
}
// Clase de prueba (incorrecta)

class Main {

    public static void main(String[] args) {
        AnimalT14 miAnimal = new Perro();
       // miAnimal.correr(); // Error de compilación: El método correr() no existe en Animal
    }
}
