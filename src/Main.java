/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import Taller1.Ejercicios.CuenaBancaria;
import Taller1.Ejercicios.Estudiante;
import Taller1.Ejercicios.Libro;
import java.util.Scanner;
/**
 *
 * @author Navid Lobato
 */
public class Main {
    
    
    
    public static void main (String [] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("---------Libro---------");
        System.out.println("Por favor digite el Nombre del Autor:");
        String autor= sc.nextLine();
        System.out.println("Por favor digite el Nombre del libro:");
        String titulo= sc.nextLine();
        System.out.println("Por favor digite el Numero de paginas:");
        String numpag= sc.nextLine();
        //clase Libro
        Libro l1 = new Libro();
        Libro l2 = new Libro(titulo, autor, numpag);
        System.out.println(l1.toString());
        System.out.println(l2.toString());
        
        
        
        
        
        //clase CuentaBancaria
        System.out.println("---------Cuenta Bancaria---------");
        System.out.println("Por favor digite el Numero de cuenta :");
        String num= sc.nextLine();
        System.out.println("Por favor digite el Tipo de cuenta:");
        String tipoc= sc.nextLine();
        System.out.println("Por favor digite el Saldo:");
        double saldo = sc.nextDouble();
        
        CuenaBancaria c1= new CuenaBancaria();
        CuenaBancaria c2= new CuenaBancaria(num, tipoc);
        CuenaBancaria c3= new CuenaBancaria(num, saldo ,tipoc);
        
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
        
        
        //clase Estudiante
        System.out.println("---------Estudiante---------");
        System.out.println("Por favor digite el Nombre :");
        String nombre= sc.nextLine();
        System.out.println("Por favor digite la edad:");
        String edad= sc.nextLine();
        System.out.println("Por favor digite el Curso:");
        String curso= sc.nextLine();
        Estudiante e1 = new Estudiante();
        Estudiante e2 = new Estudiante(nombre, edad);
        Estudiante e3 = new Estudiante(nombre, edad, curso );
        
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());
        
        
        sc.close();
        
        
    }
    
   
}
