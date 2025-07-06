/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller7.Ejercicios;

/**
 *
 * @author Navid Lobato
 */
public class CuentaBancariaT7 {
    
     private String numnmeroCuenta;
    String tipoCuenta;
    private double saldo;

    public CuentaBancariaT7(String numnmeroCuenta, String tipoCuenta, double saldo) {
        this.numnmeroCuenta = numnmeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
    }
    
    public void mostrarDetalles(){
        System.out.println("Numero cuenta:" + this.numnmeroCuenta);
        System.out.println("TipoCuenta: " + this.tipoCuenta);
        System.out.println("Saldo:" + this.saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}
