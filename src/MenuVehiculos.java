import java.util.*; // Corregido: util en lugar de utils

public class MenuVehiculos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opciones;

        do {
            System.out.println("\n|| === Menu de Vehiculos === ||");
            System.out.println("|| 1. Agregar Carros           ||"); 
            System.out.println("|| 2. Agregar Camioneta        ||");
            System.out.println("|| 3. Agregar Motocicleta      ||");
            System.out.println("|| 0. Volver al Menu Principal ||");
            System.out.print("\n Seleccione una opcion: ");
            opciones = sc.nextInt();
            sc.nextLine();

            if(opciones == 0){
                System.out.println("> Volviendo al menu principal... <");
                break;
            }

            if(opciones >= 1 && opciones <= 3){
                System.out.print("\nIngrese la marca: ");
                String marca = sc.nextLine();
                System.out.print("Ingrese el modelo: ");
                String modelo = sc.nextLine();
                System.out.print("Ingrese el año: ");
                int year = sc.nextInt();
                sc.nextLine();

                switch(opciones){
                    case 1:
                        System.out.print("Ingrese el numero de puertas: ");
                        int puertas = sc.nextInt();
                        System.out.print("Ingrese el precio: ");
                        double precioCarro = sc.nextDouble();
                        Carro carro = new Carro(marca, modelo, year, puertas, precioCarro);
                        System.out.println("\n--- Informacion del Carro Agregado ---");
                        carro.mostrarInformacion();
                        break;
                        
                    case 2:
                        System.out.print("Ingrese la capacidad de carga: ");
                        double carga = sc.nextDouble();
                        System.out.print("Ingrese el precio: ");
                        double precioCamioneta = sc.nextDouble();
                        Camionetas camioneta = new Camionetas(marca, modelo, year, carga, precioCamioneta);
                        System.out.println("\n--- Informacion de la Camioneta Agregada ---");
                        camioneta.mostrarInformacion(); 
                        break;
                        
                    case 3:
                        System.out.print("Ingrese el cilindraje: ");
                        int cilindraje = sc.nextInt();
                        System.out.print("Ingrese el precio: ");
                        double precioMoto = sc.nextDouble();
                        
                        Motocicleta moto = new Motocicleta(marca, modelo, year, cilindraje, precioMoto);
                        System.out.println("\n--- Informacion de la Motocicleta Agregada ---");
                        moto.mostrarInformacion();
                        break;
                }
            }
        } while (opciones != 0); 
    }
}