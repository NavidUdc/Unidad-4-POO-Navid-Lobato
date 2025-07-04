/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller1.Ejercicios;

/**
 *
 * @author Navid Lobato
 */
public class Estudiante {
    
    String nombre;
    String edad;
    String curso;

    public Estudiante() {
        this.curso="0";
        this.edad ="0";
        this.nombre = "Desconocido";
    }
    public Estudiante(String nombre , String edad) {
        this.edad =edad;
        this.nombre = nombre;
    }

    public Estudiante(String nombre, String edad, String curso) {
        this(nombre, edad);
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
    }
    
    
    @Override
    public String toString (){
        return "Nombre : " + nombre + ", Curso: " + curso + ", Edad: " + edad ;
    }
    
    
    
    
}
