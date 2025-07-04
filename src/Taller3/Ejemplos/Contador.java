/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller3.Ejemplos;

/**
 *
 * @author Navid Lobato
 */
public class Contador {

    static int contadorGlobal = 0; // Atributo estático

    public Contador() {
        contadorGlobal++; // Incrementa el contador global cada vez que se crea un objeto
    }

    public static void mostrarContador() {
        System.out.println("Contador global: " + contadorGlobal);
    }

    public class Main {

        public static void main(String[] args) {
            Contador c1 = new Contador();
            Contador c2 = new Contador();
            Contador c3 = new Contador();
// Se accede al método estático usando el nombre de la clase
            Contador.mostrarContador(); // Muestra: Contador global: 3
        }
    }
    
}
