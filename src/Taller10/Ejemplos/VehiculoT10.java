/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller10.Ejemplos;

/**
 *
 * @author Navid Lobato
 */
public class VehiculoT10 {

    public void acelerar(int velocidad) {
        System.out.println("El vehículo acelera a " + velocidad + " km/h.");
    }
}
// Clase derivada (incorrecta)

class Coche extends VehiculoT10 {
// Error de compilación: Diferente firma del método
/*
    @Override
    public void acelerar() {
        System.out.println("El coche acelera.");
    }*/
}
