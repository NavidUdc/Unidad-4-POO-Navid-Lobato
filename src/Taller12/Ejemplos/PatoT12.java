/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller12.Ejemplos;

/**
 *
 * @author Navid Lobato
 */
public class PatoT12 implements VoladorT12, NadadorT12{

    @Override
    public void volar() {
       System.out.println("El pato esta volando");
    }

    @Override
    public void nadar() {
       System.out.println("El pato esta nadadno");
    }
    
}
