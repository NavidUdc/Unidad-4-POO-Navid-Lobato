/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller7.Ejercicios;

/**
 *
 * @author Navid Lobato
 */
public class EmpleadoT7 {
    String nombre;
   private  double salario;

    public EmpleadoT7(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if(salario > 100 ){
        this.salario = salario;
    } else{
            System.out.println("El salrio debe sewr mayo a 100");
        }
    }
   
   
}
