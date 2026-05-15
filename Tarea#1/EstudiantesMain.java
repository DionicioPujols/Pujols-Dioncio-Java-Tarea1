import java.util.*;

public class EstudiantesMain{
    public static void Inicio(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de estudiantes: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        ArrayList<Estudiantes> estudiantes = new ArrayList<>();

        for(int i = 0; i < n; i++){
            System.out.print("Ingrese el nombre del estudiante: ");
            String nombre = sc.nextLine();

            System.out.print("Ingrese la edad del estudiante: ");
            int edad = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Ingrese la carrera del estudiante: ");
            String carrera = sc.nextLine();

            System.out.print("Ingrese la matricula del estudiante: ");
            String matricula = sc.nextLine();

            Estudiantes e = new Estudiantes(nombre, edad, carrera, matricula);
            estudiantes.add(e);
        }

        System.out.println("\n\n||-----------------------------------------------||");
        System.out.println("|| -- Tabla de informacion de los estudiantes -- ||");
        System.out.println("||-----------------------------------------------||");

        for(Estudiantes e : estudiantes){
            System.out.println("Nombre: " + e.getNombre());
            System.out.println("Edad: " + e.getEdad());
            System.out.println("Carrera: " + e.getCarrera());
            System.out.println("Matricula: " + e.getMatricula());
            System.out.println("-----------------------------------------------");
        }
    }
}