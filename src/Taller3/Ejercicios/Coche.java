/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller3.Ejercicios;

/**
 *
 * @author Navid Lobato
 */
public class Coche {
    private String marca;
    private String modelo;
    static int contadorCoches=0;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches ++;
        
    }
    
    public static void  mostrarContador(){
        System.out.println("Cantdidad de coches: " + contadorCoches);
    }
    
    
}
