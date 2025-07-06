/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller9.Ejercicios;

/**
 *
 * @author Navid Lobato
 */
public class PezT9 extends AnimalT9 {
     private String tipoDeAgua;

    public PezT9(String especie, String tipoDeAgua) {
        super(especie); 
        this.tipoDeAgua = tipoDeAgua;
    }

    public void mostrarDetalles() {
        super.mostrarEspecie(); 
        System.out.println("Tipo de agua: " + tipoDeAgua);
    }
}
