import java.util.*;

public class Camionetas extends Vehiculos{

    private double carga;
    private double precio;

    public Camionetas(){
        setCarga(0);
        setPrecio(0);
    }

    public Camionetas(String marca, String modelo, int year, double carga, double precio){
        super(marca, modelo, year);
        this.carga = carga;
        this.precio = precio;
    }

    public double getCarga(){
        return carga;
    }
    
    public double getPrecio(){
        return precio;
    }

    public void setCarga(double carga){
        this.carga = carga;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Carga: " + carga);
        System.out.println("Precio: " + precio);
    }

}
