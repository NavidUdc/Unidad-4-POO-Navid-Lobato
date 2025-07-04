/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller3.Ejemplos;

/**
 *
 * @author Navid Lobato
 */
public class Banco {

    public static double tasaInteres = 0.05; // Atributo estático para la tasa de interés

    public static void modificarTasa(double nuevaTasa) {
        tasaInteres = nuevaTasa; // Se modifica un atributo estático
    }

    public static void cambiarSaldo(double saldo) {
// Intentar cambiar saldo no tiene sentido en un contexto estático
        saldo = saldo * (1 + tasaInteres); // No hay un atributo 'saldo' definido
    }
}
