/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller8.Ejercicios;

/**
 *
 * @author Navid Lobato
 */
public class GerenteT8 extends EmpleadoT8 {
    private String departamento;

    public GerenteT8(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Departamento: " + departamento);
    }
}
