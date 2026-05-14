import java.util.*;

public class ContadorVocales{
    public static void Contar(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = sc.nextLine().toLowerCase();

        int Contador = 0;
        for(int i =0; i < frase.length(); i++){
            char c = frase.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                Contador++;
            }
        }

        System.out.println("El número de vocales en la frase es: " + Contador);
    }
}