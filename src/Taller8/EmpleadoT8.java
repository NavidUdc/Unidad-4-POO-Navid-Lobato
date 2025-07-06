/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller8;

/**
 *
 * @author Navid Lobato
 */
public class EmpleadoT8 {

    protected String nombre;
    protected double salario;

    public EmpleadoT8(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre + ", Salario: " + salario);
    }
}
// Clase derivada

class GerenteT8 extends EmpleadoT8 {

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
