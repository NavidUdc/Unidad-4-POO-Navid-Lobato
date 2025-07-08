/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller15.Ejemplos;

/**
 *
 * @author Navid Lobato
 */
public class CalculoTotalService {

    public double calcularImpuestos(PedidoEjeT15 pedido) {
        return pedido.getTotal() * 0.15;
    }
}
