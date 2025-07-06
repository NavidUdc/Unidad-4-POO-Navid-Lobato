/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller8.Ejercicios;

/**
 *
 * @author Navid Lobato
 */
public class EstudianteT8 extends PersonaT8 {
    
      private String matricula;

    public EstudianteT8(String nombre, int edad, String matricula) {
        super(nombre, edad);
        this.matricula = matricula;
    }

    
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Matrícula: " + matricula);
    }
}
