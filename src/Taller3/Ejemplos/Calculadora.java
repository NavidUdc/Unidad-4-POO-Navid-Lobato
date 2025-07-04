/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller3.Ejemplos;

/**
 *
 * @author Navid Lobato
 */
public class Calculadora {

        public static int sumar(int a, int b) {
            return a + b;
        }
    
        public class Main {

            public static void main(String[] args) {
                int resultado = Calculadora.sumar(5, 7); // Llama al método estático sin crear una instancia
                System.out.println("Resultado: " + resultado); // Muestra: Resultado: 12
            }
        }


}