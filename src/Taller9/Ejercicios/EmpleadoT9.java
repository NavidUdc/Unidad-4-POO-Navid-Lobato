/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller9.Ejercicios;

/**
 *
 * @author Navid Lobato
 */
public class EmpleadoT9 extends PersonaT9 {
      private String departamento;

    public EmpleadoT9(String nombre, int edad, String departamento) {
        super(nombre, edad); 
        this.departamento = departamento;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Departamento: " + departamento);
    }
}
