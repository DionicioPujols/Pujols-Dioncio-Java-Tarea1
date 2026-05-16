import java.util.*;

public class SistemaInventario{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        
        // Creamos un objeto de la clase Inventario para gestionar el inventario
        Inventario inv = new Inventario();
        int opcion;

        do{

            System.out.println("\n|| --------------------------- ||");
            System.out.println("|| Sistema de Inventario       ||");
            System.out.println("|| --------------------------- ||");
            System.out.println("|| 1. Agregar producto         ||");
            System.out.println("|| 2. Visualizar inventario    ||");
            System.out.println("|| 0. Salir                    ||");
            System.out.print("\nSeleccione una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer
            switch(opcion){
                case 1:
                    System.out.print("Ingrese el ID del producto: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese el precio: ");
                    double precio = sc.nextDouble();
                    System.out.print("Ingrese la cantidad: ");
                    int cantidad = sc.nextInt();
                    Productos productos = new Productos(id, nombre, precio, cantidad);
                    inv.AgregarProducto(productos);
                    System.out.println("\nProducto agregado exitosamente!");
                    break;
                case 2:
                    inv.mostrarInventario();
                    break;
                case 0:
                    System.out.println("> Volviendo al menu principal... <");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        }while(opcion != 0);

    }
}   