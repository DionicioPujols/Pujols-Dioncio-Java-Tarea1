import java.util.*;

public class TablaMultiplicar{
    public static void Tabla(String[] args){ 
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nIngresa un número: ");
        int n = scanner.nextInt();
        
        System.out.println("\ntabla de multiplicar del numero " + n + "\n");
        System.out.print("   |   ");
        //Este for imprimira todos los elementos de tabla, del numero elegido por el usurio.
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
            if (i < 10) System.out.print("   |   ");//Esto solamente es algo visual.
        }
        System.out.println();
    }
}
