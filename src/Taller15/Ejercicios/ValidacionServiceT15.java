/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller15.Ejercicios;

/**
 *
 * @author Navid Lobato
 */
public class ValidacionServiceT15 {
      public boolean validar(UsuarioT15 usuario) {
        return usuario.getNombre()!= null &&
               usuario.getNombre().length() >= 4 &&
               usuario.getContraseña().length() >= 6;
    }
}
