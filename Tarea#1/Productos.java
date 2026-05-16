import java.util.*;

public class Productos{
    private int id;
    private String nombre;
    private double precio;
    private int cantidad;

    public Productos(){
        this.id = (0);
        this.nombre = (nombre);
        this.precio = (0);
        this.cantidad = (0);
    }

    public Productos(int id, String nombre, double precio, int cantidad){
        this.id = id;
        this.nombre= nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int getId(){
        return id;
    }

    public String getNombre(){
        return nombre;
    }

    public double getPrecio(){
        return precio;
    }

    public int getCantidad(){
        return cantidad;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }

}