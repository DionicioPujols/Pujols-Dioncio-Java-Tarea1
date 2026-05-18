import java.util.*;

public class Vehiculos{

    private String marca;
    private String modelo;
    private int year;

    public Vehiculos(){
        this.marca = "";
        this.modelo = "";
        this.year = 0;
    }

    public Vehiculos(String marca, String modelo, int year){
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public int getYear(){
        return year;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }
        
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void mostrarInformacion(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + year);
    }

}
