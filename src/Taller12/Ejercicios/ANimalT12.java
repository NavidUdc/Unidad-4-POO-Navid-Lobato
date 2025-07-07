/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller12.Ejercicios;

/**
 *
 * @author Navid Lobato
 */
public class ANimalT12 implements NadadorT12, VoladorT12 {
    
    private String animal; 

    public ANimalT12(String animal) {
        this.animal = animal;
    }
    
    
    @Override
    public void volar(){
        System.out.println("El animal" + animal + "esta volando");
    }
    
    @Override
    public void nadar(){
        System.out.println("El animal" + animal + "esta nadando");
    }
}
