/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller11.Ejercicios;

/**
 *
 * @author Navid Lobato
 */
public abstract class UsoIncoorectoVehiculo {
    public void mover (){
        System.out.println("El vehiculo esta en movimoento");
        
    }
    
}

class Carro extends UsoIncoorectoVehiculo{
    // no se sobreeescibe el metodo mover 
}
