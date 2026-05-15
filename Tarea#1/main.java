import java.util.*;

public class main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int opciones;

    do{
        System.out.println("\n|| === Menu Principal ===||");
        System.out.println("|| 1. Calculadora         ||");
        System.out.println("|| 2. Numeros par o Impar ||");
        System.out.println("|| 3. Tabla de Multiplicar||");
        System.out.println("|| 4. Contador de Vocales ||");
        System.out.println("|| 5. Promedio de notas   ||");
        System.out.println("|| 6. Clase Estudiante    ||");
        System.out.println("|| 0. Salir               ||");  
        System.out.print("\n Seleccione una opcion: "); 
        opciones = sc.nextInt();

        switch(opciones){
            case 1: 
                Calculadora.Inicio(args);
                break;
            case 2: 
                Par_Impar.ParImpar(args);
                break;
            case 3:
                TablaMultiplicar.Tabla(args);
                break;
            case 4:
                ContadorVocales.Contar(args);
                break;
            case 5:
                PromedioNotas.Promedio(args);
                break;   
            case 6:
                EstudiantesMain.Inicio(args);
                break;
            default:
                break;
        }
        
    }while(opciones != 0);
        System.out.println("> Saliendo del programa... <");
    sc.close();
    }
}