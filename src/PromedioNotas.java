import java.util.*;

public class PromedioNotas{
    public static void Promedio(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de notas: ");
        int n = sc.nextInt();

        //Sirve para sumar el total de las notas ingresadas por el usuario.
        double suma = 0;
        for(int i = 1; i <= n; i++){
            System.out.print("Ingrese la nota " + i + ": ");
            double nota = sc.nextDouble();
            suma += nota;
        }
        double promedio = suma / n;
        System.out.println("El total de su promedio es: " + promedio);

    }
}