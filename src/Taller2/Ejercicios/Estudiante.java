/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller2.Ejercicios;

/**
 *
 * @author Navid Lobato
 */
public class Estudiante {

    private String nombre;
    private String edad;

    public Estudiante() {
        this("Desconocido", "0");
    }

    public Estudiante(String nombre, String precio) {
        this.nombre = nombre;
        this.edad = precio;
    }

    public static void mostrarNombre(Estudiante e) {
        System.out.println("Nombre:" + e.nombre); 
    }

    public void mostrarEstudiante() {
        System.out.println("Nombre:" + this.nombre + " Edad:" + this.edad);
    }

}
