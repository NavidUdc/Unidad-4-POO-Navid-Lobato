/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller1.Ejemplos;

/**
 *
 * @author Navid Lobato
 */
public class Coche {
    
        String marca;
        String modelo;

        // Constructor por defecto
        public Coche() {
            this.marca = "Desconocida";
        }

        // Constructor parametrizado
        public Coche(String marca) {
            this.marca = marca;
        }

        // Construcotr sobrecargado con uso del this.
        public Coche(String marca, String modelo) {
            this(marca); // Llama al constructor de un solo parámetro
            this.modelo = modelo;
        }

        // Constructor sobrecargado con dos parámetros
        /* public Coche(String marca, String modelo) {
            this.marca = marca;
            this.modelo = modelo;
        }*/
        
 
    
}
