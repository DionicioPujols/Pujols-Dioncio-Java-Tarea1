import java.util.*;

public class Par_Impar{
    public static void ParImpar(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("\n || Programa para determinar si un numero es par o impar ||");

        System.out.print("Ingrese un numero: ");
        n = sc.nextInt();
        if(n % 2 == 0){  //Si el residuo del numero dividido entre 2 = 0, entonces es par.
            System.out.println("El numero "+ n + " es par");
        }else{
            System.out.println("El numero "+ n +" es impar");
        }
        
    }
}
