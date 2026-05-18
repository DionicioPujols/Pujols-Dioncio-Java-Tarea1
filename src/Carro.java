import java.util.*;

public class Carro extends Vehiculos{
    
    private int puertas;
    private double precio;

    public Carro(){
        super();
        setPuertas(0);
        setPrecio(0);
    }

    public Carro(String marca, String modelo, int year, int puertas, double precio){
        super(marca, modelo, year);
        this.puertas = puertas;
        this.precio = precio;
    }

    public int getPuertas(){
        return puertas;
    }

    public double getPrecio(){
        return precio;
    }

    public void setPuertas(int puertas){
        this.puertas = puertas;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Puertas: " + puertas);
        System.out.println("Precio: " + precio);
    }

}