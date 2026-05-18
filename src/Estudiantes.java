import java.util.*;

public class Estudiantes{
    private String nombre;
    private int edad;
    private String carrera;
    private String matricula;

    public Estudiantes(){
        setNombre(nombre);
        setEdad(0);
        setCarrera(carrera);
        setMatricula(matricula);
    }

    public Estudiantes(String nombre, int edad, String carrera, String matricula){
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.matricula = matricula;
    }

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public String getCarrera(){
        return carrera;
    }

    public String getMatricula(){
        return matricula;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setCarrera(String carrera){
        this.carrera = carrera;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
}