import java.util.*;

public class main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = 5;
        ArrayList<Visitante> visitantes = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            System.out.print("Ingrese el nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Ingrese la cedula: ");
            String Cedula = sc.nextLine();

            System.out.print("Ingrese la edad: ");
            int edad = sc.nextInt();
            sc.nextLine(); 

            Visitante v = new Visitante(nombre, Cedula, edad);
            visitantes.add(v);
        }

        System.out.println("\n\n||----------------------------------------------||");
        System.out.println("|| -- Tabla de informacion de los visitantes -- ||");
        System.out.println("||----------------------------------------------||");
        
        for(Visitante v : visitantes){
            v.ImprimirVisitante();
        }
    }
}