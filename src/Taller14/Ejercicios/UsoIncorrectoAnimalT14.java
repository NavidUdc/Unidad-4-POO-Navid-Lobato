/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller14.Ejercicios;

/**
 *
 * @author Navid Lobato
 */
public class UsoIncorrectoAnimalT14 {
        public void hacerSonido() {
        System.out.println("Animal hace su sonido");
    }
}

 class Perro extends UsoIncorrectoAnimalT14 {
    public void ladrar() {
        System.out.println("guauuuuuuuu!!!");
    }
}

 class PruebaError {
    public static void main(String[] args) {
        UsoIncorrectoAnimalT14 a = new Perro();
      //  a.hacerSonido();   l
    }
}
