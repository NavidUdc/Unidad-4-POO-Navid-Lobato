/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller15.Ejercicios;

/**
 *
 * @author Navid Lobato
 */
public class AutenticacionServiceT15 {
    public boolean autenticar(UsuarioT15 usuario, String contrasena) {
        return usuario.getContraseña().equals(contrasena);
    }
}
