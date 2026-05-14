public class Visitante{
    private String nombre;
    private String Cedula;
    private int edad;

    public Visitante(){
        setEdad(0);
        setCedula(Cedula);
        setNombre(nombre);
    }
    public Visitante(String nombre, String Cedula, int edad){
        setEdad(edad);
        setCedula(Cedula);
        setNombre(nombre);
    }

    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public String getCedula(){
        return Cedula;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setCedula(String Cedula){
        this.Cedula = Cedula;
    }

    public void ImprimirVisitante(){
        System.out.println("||El nombre: " + getNombre());
        System.out.println("||La cedula: " + getCedula());
        System.out.println("||La edad: " + getEdad());
        System.out.println("||----------------------------------------------||");
    }
}