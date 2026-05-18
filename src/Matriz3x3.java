import java.util.*;

public class Matriz3x3 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        Scanner sc = new Scanner(System.in);

        System.out.println("\n|| -------------------------- ||");
        System.out.println("|| Programa de una matriz 3x3 ||");
        System.out.println("|| -------------------------- ||\n");

        System.out.println("Ingrese los elementos de la matriz 3x3\n");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nLa matriz ingresada es:");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}