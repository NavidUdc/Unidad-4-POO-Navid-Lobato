/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller4.Ejercicios;

/**
 *
 * @author Navid Lobato
 */
public class CocheT4 {
    private String marca;
    private String modelo;
    private double velocidadMax;

    public CocheT4(String marca, String modelo, double velocidadMax) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMax = velocidadMax;
    }

    
    public void acelaerar(double velocidad){
        if(velocidad > 0){
            velocidadMax += velocidad;
        }
        
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(double velocidadMax) {
        this.velocidadMax = velocidadMax;
    }
    
    
    
    
}
