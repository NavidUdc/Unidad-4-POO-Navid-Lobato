/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller15.Ejemplos;

/**
 *
 * @author Navid Lobato
 */
public class AutenticacionService {

    public boolean autenticar(UsuarioEjeT15 usuario, String contrasena) {
        return usuario.getNombre().equals("admin") && contrasena.equals("1234");
    }
}
