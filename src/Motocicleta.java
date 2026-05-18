import java.util.*;

public class Motocicleta extends Vehiculos{

    private int cilindraje;
    private double precio;

    public Motocicleta(){
        setCilindraje(0);
        setPrecio(0);
    }

    public Motocicleta(String marca, String modelo, int year, int cilindraje, double precio){
        super(marca, modelo, year);
        this.cilindraje = cilindraje;
        this.precio = precio;
    }

    public int getCilindraje(){
        return cilindraje;
    }

    public double getPrecio(){
        return precio;
    }

    public void setCilindraje(int cilindraje){
        this.cilindraje = cilindraje;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Cilindraje: " + cilindraje);
        System.out.println("Precio: " + precio);
    }

}
