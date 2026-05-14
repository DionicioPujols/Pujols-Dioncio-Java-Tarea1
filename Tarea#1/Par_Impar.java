import java.util.*;

public class Par_Impar{
    public static void ParImpar(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Ingrese un numero: ");
        n = sc.nextInt();
        if(n % 2 == 0){
            System.out.println("El numero "+ n + " es par");
        }else{
            System.out.println("El numero "+ n +" es impar");
        }
        
    }
}
