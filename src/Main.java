/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import Taller1.Ejercicios.CuenaBancaria;
import Taller1.Ejercicios.Estudiante;
import Taller1.Ejercicios.Libro;
import Taller10.Ejercicios.EstudianteT10;
import Taller10.Ejercicios.PersonaT10;
import Taller10.Ejercicios.ProfesorT10;
import Taller11.Ejercicios.CirculoT11;
import Taller11.Ejercicios.EmpleadoT11;
import Taller11.Ejercicios.FiguraT11;
import Taller11.Ejercicios.GerenteT11;
import Taller11.Ejercicios.RectanguloT11;
import Taller11.Ejercicios.VendedorT11;
import Taller12.Ejercicios.ANimalT12;
import Taller12.Ejercicios.PersonaT12;
import Taller13.Ejercicios.FiguraT13;
import Taller13.Ejercicios.PatoT13;
import Taller13.Ejercicios.Rectangulo;
import Taller13.Ejercicios.TrianguloT13;
import Taller14.Ejercicios.BicicletaT14;
import Taller14.Ejercicios.CirculoT14;
import Taller14.Ejercicios.CocheT14;
import Taller14.Ejercicios.EstudianteT14;
import Taller14.Ejercicios.FiguraT14;
import Taller14.Ejercicios.PersonaT14;
import Taller14.Ejercicios.ProfesorT14;
import Taller14.Ejercicios.RectanguloT14;
import Taller14.Ejercicios.VehiculoT14;
import Taller2.Ejercicios.Estudiante1;
import Taller2.Ejercicios.Producto;
import Taller3.Ejercicios.Matematicas;
import Taller4.Ejercicios.CocheT4;
import Taller4.Ejercicios.EstudianteT4;
import Taller5.Ejercicios.ProductoEjericioT5;
import Taller5.Ejercicios.pruebaMain;
import Taller6.Ejercicios.VehiculoT6;
import Taller7.Ejercicios.CuentaBancariaT7;
import Taller7.Ejercicios.EmpleadoT7;
import Taller8.Ejercicios.EmpleadoT8;
import Taller8.Ejercicios.EstudianteT8;
import Taller8.Ejercicios.GerenteT8;
import Taller9.Ejercicios.EmpleadoT9;
import Taller9.Ejercicios.PezT9;
import java.util.Scanner;

/**
 *
 * @author Navid Lobato
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite una opcion:");
        while (!sc.hasNextInt()) {
            System.out.println("Por favor, ingresa un número válido:");
            sc.next(); 
        }
        int op = sc.nextInt();
        sc.nextLine(); 
        switch (op) {

            case 1:
                System.out.println("---------Libro---------");
                System.out.println("Por favor digite el Nombre del Autor:");
                String autor = sc.nextLine();
                System.out.println("Por favor digite el Nombre del libro:");
                String titulo = sc.nextLine();
                System.out.println("Por favor digite el Numero de paginas:");
                String numpag = sc.nextLine();
                //clase Libro
                Libro l1 = new Libro();
                Libro l2 = new Libro(titulo, autor, numpag);
                System.out.println(l1.toString());
                System.out.println(l2.toString());

                //clase CuentaBancaria
                System.out.println("---------Cuenta Bancaria---------");
                System.out.println("Por favor digite el Numero de cuenta :");
                String num = sc.nextLine();
                System.out.println("Por favor digite el Tipo de cuenta:");
                String tipoc = sc.nextLine();
                System.out.println("Por favor digite el Saldo:");
                double saldo = sc.nextDouble();

                CuenaBancaria c1 = new CuenaBancaria();
                CuenaBancaria c2 = new CuenaBancaria(num, tipoc);
                CuenaBancaria c3 = new CuenaBancaria(num, saldo, tipoc);

                System.out.println(c1.toString());
                System.out.println(c2.toString());
                System.out.println(c3.toString());

                //clase Estudiante
                System.out.println("---------Estudiante---------");
                System.out.println("Por favor digite el Nombre :");
                String nombre = sc.nextLine();
                System.out.println("Por favor digite la edad:");
                String edad = sc.nextLine();
                System.out.println("Por favor digite el Curso:");
                String curso = sc.nextLine();
                Estudiante e1 = new Estudiante();
                Estudiante e2 = new Estudiante(nombre, edad);
                Estudiante e3 = new Estudiante(nombre, edad, curso);

                System.out.println(e1.toString());
                System.out.println(e2.toString());
                System.out.println(e3.toString());

                break;
            case 2:
                System.out.println("---------Estudiante---------");
                System.out.println("Por favor digite el Nombre :");
                String nombree1 = sc.nextLine();
                System.out.println("Por favor digite la edad:");
                String edade1 = sc.nextLine();

                Estudiante1 est1 = new Estudiante1();
                Estudiante1 est2 = new Estudiante1(nombree1, edade1);

                est1.mostrarEstudiante();
                est2.mostrarEstudiante();

                System.out.println("---------Producto---------");
                System.out.println("Por favor digite el Numero :");
                String nombreProducto = sc.nextLine();
                System.out.println("Por favor digite la edad:");
                double preioProducto = sc.nextDouble();

                Producto pro1 = new Producto(nombreProducto, preioProducto);
                pro1.mostrarProducto();
                break;
            case 3:
                System.out.println("---------Matematicas---------");
                System.out.println("Selecciona la accion a realizar");
                System.out.println("1 ----------- Suma");
                System.out.println("2 ----------- Resta");
                System.out.println("3 ----------- Multiplicacion");
                System.out.println("4 ----------- Division");
                int opc = sc.nextInt();
                System.out.println("Digite los numeros");
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                double resultado = 0;

                switch (opc) {
                    case 1:
                        System.out.println("-----------Suma------------------");
                        System.out.println("Digite los numeros a sumar");
                        resultado = Matematicas.Sumar(a, b);
                        break;
                    case 2:
                        System.out.println("-----------Resta------------------");
                        System.out.println("Digite los numeros a sumar");
                        resultado = Matematicas.Restar(a, b);
                        break;
                    case 3:
                        System.out.println("-----------Multiplicacipn------------------");
                        System.out.println("Digite los numeros a sumar");
                        resultado = Matematicas.Multiplicar(a, b);
                        break;
                    case 4:
                        System.out.println("-----------Diviison------------------");
                        System.out.println("Digite los numeros a sumar");
                        resultado = Matematicas.Div(a, b);
                        break;
                    default:
                        System.out.println("Opcion no valida");
                        break;
                }

                System.out.println("Resultado:" + resultado);
                break;
            case 4:
                System.out.println("---------Estudiante---------");
                EstudianteT4 est4 = new EstudianteT4("Navid", 19, 3.9);
                System.out.println("Nombre: " + est4.getNombre());
                System.out.println("Promedio: " + est4.getNotaProm());
                System.out.println("Edad: " + est4.getEdad());

                System.out.println("---------Coche---------");
                CocheT4 c = new CocheT4("BMW", "R8", 202);
                //System.out.println("Marca: " + c.marca); // muestra error debido a que es un atributo privado
                System.out.println("Marca:" + c.getMarca());
                break;

            case 5:
                System.out.println("---------Taller 5---------");
                ProductoEjericioT5 ej = new ProductoEjericioT5();
                pruebaMain prue = new pruebaMain();
                break;

            case 6:
                System.out.println("---------Taller 6-----------");

                VehiculoT6 veh = new VehiculoT6("Nkd", "Akt");
                break;

            case 7:

                System.out.println("---------Taller 7-----------");

                System.out.println("------------Empleado----------------");
                System.out.println("Digite el nombre");
                String nombret7 = sc.nextLine();
                System.out.println("Digite el salario");
                double salarioT7 = sc.nextDouble();

                EmpleadoT7 empleadot7 = new EmpleadoT7(nombret7, salarioT7);
                System.out.println("Nombre: " + nombret7 + "Salario: " + empleadot7.getSalario());
                empleadot7.setSalario(50);

                System.out.println("------------Cuenta bamncaria----------------");
                System.out.println("Digite el numero de cuenta");
                String numCuentaT7 = sc.nextLine();
                System.out.println("Digite el tipo");
                String tipoT7 = sc.nextLine();

                CuentaBancariaT7 cue = new CuentaBancariaT7(numCuentaT7, tipoT7, 0);
                cue.mostrarDetalles();
                //System.out.println(cue.numCuenta); // no deja acceder ditectamente porque es private 

                break;
            case 8:
                System.out.println("---------Taller 8-----------");
                System.out.println("---------Prueba Estudiante--------");

                EstudianteT8 est8_1 = new EstudianteT8("Laura ", 20, "2025A1234");
                EstudianteT8 est8_2 = new EstudianteT8("Juan ", 18, "2025B5678");

                est8_1.mostrarInformacion();
                System.out.println("------------------------");
                est8_2.mostrarInformacion();

                System.out.println("--------- Prueba Empleado y Gerente-----------");
                EmpleadoT8 empleT8 = new EmpleadoT8("Navid lobato", 1200);
                GerenteT8 gereT8 = new GerenteT8("Marta Saez", 4300, "Recursos");
                empleT8.mostrarDetalles();
                System.out.println("------------------------");
                gereT8.mostrarDetalles();

                break;
            case 9:
                System.out.println("---------Taller 9-----------");
                System.out.println("---------Prueba Empleado-----------");
                EmpleadoT9 empleT9 = new EmpleadoT9("Navid jose ", 33, "Desarrollo de software");
                empleT9.mostrarDetalles();
                System.out.println("---------Prueba Animal-----------");
                PezT9 pez = new PezT9("Mojarra Roja", "Mar");
                pez.mostrarDetalles();
                break;

            case 10:
                System.out.println("---------Taller 10-----------");
                System.out.println("---------Prueba Presentacion-----------");

                PersonaT10 persona10 = new PersonaT10();
                EstudianteT10 estudiante10 = new EstudianteT10();
                ProfesorT10 profesor10 = new ProfesorT10();

                persona10.presentarse();
                profesor10.presentarse();
                estudiante10.presentarse();

                break;

            case 11:
                 System.out.println("---------Taller 11-----------");
                System.out.println("---------Prueba Figuras-----------");
                
                FiguraT11 fig1 = new CirculoT11(5);
                FiguraT11 fig2 = new RectanguloT11(5, 8);
                
                fig1.mostrarArea();
                fig2.mostrarArea();
                
                System.out.println("---------Prueba Empleado-----------");
                EmpleadoT11 gere= new GerenteT11("Navid", 2000);
                EmpleadoT11 vende= new VendedorT11("Marta", 59);
                
                gere.mostrarDetalles();;
                System.out.println("--------------------");
                vende.mostrarDetalles();
                
                break;
            case 12:
                 System.out.println("---------Taller 12-----------");
                System.out.println("---------Prueba Persona-----------");
                PersonaT12 per= new PersonaT12("Navid");
                per.hablar();
                per.hablar();
                
                System.out.println("---------Prueba Animal-----------");
                ANimalT12 ani = new ANimalT12("Perro");
                ani.nadar();
                ani.volar();
                break;
                
            case 13:
                 System.out.println("---------Taller 13-----------");
                System.out.println("---------Prueba Figura-----------");
                
                FiguraT13 figT13= new TrianguloT13(5, 8); 
                FiguraT13 fig1T13= new Rectangulo(6, 2); 
                
                System.out.println(figT13.calcularArea());
                System.out.println(fig1T13.calcularArea());
                
                
                System.out.println("---------Prueba Pato-----------");
                PatoT13 patoT13 = new PatoT13("nase");
                patoT13.nadar();
                patoT13.volar();
                break;
            case 14:
                System.out.println("---------Taller 14-----------");
                System.out.println("---------Prueba Figura-----------");
                
                FiguraT14 fig1T14 = new CirculoT14(5);
                FiguraT14 fig2T14 = new RectanguloT14(5, 3);
                
                fig1T14.calcularArea();
                fig2T14.calcularArea();
                System.out.println("---------Prueba Persona-----------");
                PersonaT14 persona1T14 = new PersonaT14(); 
                PersonaT14 persona2T14 = new EstudianteT14(); 
                PersonaT14 persona3T14 = new ProfesorT14(); 
                
                persona1T14.presentarse();
                persona2T14.presentarse();
                persona3T14.presentarse();
                
                System.out.println("---------Prueba Vehiculo-----------");
                VehiculoT14 v1= new CocheT14();
                VehiculoT14 v2= new BicicletaT14();
                
                v1.mover();
                v2.mover();
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:

            default:
                System.out.println("Opcion Ingresada invalida");
                break;
        }

    }

}
