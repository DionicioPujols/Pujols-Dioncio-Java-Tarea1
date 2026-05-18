import java.util.*;

public class Calculadora {
    public static void Inicio(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opciones;
        
        do {
            System.out.println("\n|| --- Menú de Operaciones --- ||");
            System.out.println("|| 1. Sumar                    ||");
            System.out.println("|| 2. Restar                   ||");
            System.out.println("|| 3. Multiplicar              ||");
            System.out.println("|| 4. Dividir                  ||");
            System.out.println("|| 0. Volver al Menú Principal ||");
            System.out.print("\n|| Seleccione una opción: ");
            opciones = sc.nextInt();

            if (opciones == 0) {
                System.out.println("> Volviendo al menú principal... <");
                break; 
            }

            // Validamos que la opción sea correcta antes de pedir los números
            if (opciones >= 1 && opciones <= 4) {
                System.out.print("\nIngrese el primer numero: ");
                int a = sc.nextInt();
                System.out.print("Ingrese el segundo numero: ");
                int b = sc.nextInt();

            //menu de opciones antes de realizar las operaciones.
                switch(opciones) {
                    case 1:
                        System.out.println("La suma es: " + suma(a, b));
                        break;
                    case 2:
                        System.out.println("La resta es: " + resta(a, b));
                        break;
                    case 3:
                        System.out.println("La multiplicacion es: " + multiplicacion(a, b));
                        break;
                    case 4:
                        System.out.println("La division es: " + division(a, b));
                        break;
                }
            } else {
                System.out.println("Opcion Invalida. Inserte un numero entre 0 y 4.");
            }
        } while (opciones != 0);
        
    }

    //Todos los metodos basicos de una calculadora
    public static double suma(int a, int b){ 
        return a + b; 
    }
    public static double resta(int a, int b){ 
        return a - b; 
    }
    public static double multiplicacion(int a, int b){ 
        return a * b; 
    }
    public static double division(int a, int b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir por cero");
            return 0;
        }
        return (double) a / b;
    }
}