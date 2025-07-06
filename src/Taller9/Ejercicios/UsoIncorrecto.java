/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller9.Ejercicios;

/**
 *
 * @author Navid Lobato
 */
public class UsoIncorrecto {
    
    private int num;
    public static void main(String[] args) {
        // super.mostrarDetalles(); super no puede usarse en una clase que no hereda de otra
    }
     public void mostrar() {
        // System.out.println(super.num ) num es privado y no permite acceder de esta amnera
    }
}
