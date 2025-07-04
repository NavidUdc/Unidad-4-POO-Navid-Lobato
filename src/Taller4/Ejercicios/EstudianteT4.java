/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller4.Ejercicios;

/**
 *
 * @author Navid Lobato
 */
public class EstudianteT4 {

    private String nombre;
    private int edad;
    private double notaProm;

    public EstudianteT4(String nombre, int edad, double notaProm) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaProm = notaProm;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        }
    }

    public double getNotaProm() {
        return notaProm;
    }

    public void setNotaProm(double notaProm) {
        this.notaProm = notaProm;
    }

}
