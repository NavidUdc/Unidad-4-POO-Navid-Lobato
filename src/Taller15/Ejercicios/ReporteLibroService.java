/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller15.Ejercicios;

/**
 *
 * @author Navid Lobato
 */
public class ReporteLibroService {
     public void imprimir(LibroT15 libro) {
        System.out.println("Título: " + libro.getTitulo() +
                           ", Autor: " + libro.getAutor() +
                           ", Páginas: " + libro.getPaginas());
    }
}
