import java.util.*;

public class main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int opciones;

    do{
        System.out.print("\n|| --- Menu Principal --- ||");
        System.out.print("\n|| 1. Calculadora         ||");
        System.out.print("\n|| 2. Numeros par o Impar ||");
        System.out.println("|| 0. Salir               ||");  
        System.out.print("\n\n Seleccione una opcion: "); 
        opciones = sc.nextInt();

        switch(opciones){
            case 1: 
                Calculadora.Inicio(sc);
                break;
            case 2: 
                Par_Impar.ParImpar(args);
                break;
            default:
                break;
        }
        
    }while(opciones != 0);
        System.out.println("> Saliendo del programa... <");
    sc.close();
    }
}