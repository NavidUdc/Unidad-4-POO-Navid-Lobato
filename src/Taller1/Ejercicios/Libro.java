/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller1.Ejercicios;

/**
 *
 * @author Navid Lobato
 */
public class Libro {
    String titulo;
    String autor;
    String numPaginas;

    public Libro() {
        this.autor="Desconocido";
        this.numPaginas ="0";
        this.titulo= "Sin titulo";
                
    }

    public Libro(String tittle, String autor, String numPages) {
        this.titulo = tittle;
        this.autor = autor;
        this.numPaginas = numPages;
    }
    
    public void MostrarDetalles(){
        System.out.println("Autor: " + this.autor);
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Paginas:" + this.numPaginas);
        
    }
    
    @Override
    public String toString(){
        return "Autor: " + autor  + ", " + "Titulo: " + titulo + ", " + "Paginas: " + numPaginas ;
    }

 
    
    
    
}
