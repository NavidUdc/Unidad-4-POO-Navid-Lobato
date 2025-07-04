/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller1.Ejercicios;

/**
 *
 * @author Navid Lobato
 */
public class CuenaBancaria {
    
    String numeroCuenta;
    double saldo ;
    String tipoCuenta;

    public CuenaBancaria() {
        this.numeroCuenta ="00000000000";
        this.saldo= 0.0;
        this.tipoCuenta="Corriente";
    }
    public CuenaBancaria(String numeroCuenta, String tipoCuenta){
        this.numeroCuenta= numeroCuenta;
        this.tipoCuenta= tipoCuenta;
        this.saldo= 0.0;
    }

    
    public CuenaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }
    
    @Override
    public String toString(){
        return "Numero de Cuenta: " + numeroCuenta + ", Tipo de Cuenta" + tipoCuenta +", Saldo: " + saldo   ;
    }
    
    
            
}
