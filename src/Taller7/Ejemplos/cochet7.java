package Taller7.Ejemplos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Navid Lobato
 */
public class cochet7 {

    private String marca;
    private double velocidadMaxima;

    public cochet7(String marca, double velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }
// Método público para obtener la marca del coche

    public String getMarca() {
        return marca;
    }
// Método público para establecer la velocidad máxima

    public void setVelocidadMaxima(double velocidadMaxima) {
        if (velocidadMaxima > 0) {
            this.velocidadMaxima = velocidadMaxima;
        }
    }
// Método público para mostrar la información del coche

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca + ", Velocidad máxima: " + velocidadMaxima + " km/h");
    }
}
