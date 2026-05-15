import java.util.*;

public class ContadorVocales{
    public static void Contar(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = sc.nextLine().toLowerCase();//paso un toLowerCase para que no haya problemas con las mayusculas.

        int Contador = 0;
        for(int i =0; i < frase.length(); i++){//recorrer cada caracter de la frase.
            char c = frase.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){//pasar parametros para contar las vocales.
                Contador++;
            }
        }
        
        System.out.println("El número de vocales en la frase es: " + Contador);
    }
}