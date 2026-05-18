import java.util.*;

public class Inventario{
    private ArrayList<Productos> ListaProductos;

    //Constructor para inicializar la lista de productos.
    public Inventario(){
        ListaProductos = new ArrayList<>();
    }

    // Método para agregar un producto al inventario.
    public void AgregarProducto(Productos p){
        ListaProductos.add(p);
    }

    // Método para mostrar el inventario.
    public void mostrarInventario(){
        if(ListaProductos.isEmpty()){
            System.out.println("El inventario está vacío.");
            return;
        } else {
            System.out.println("\n--- LISTA DE INVENTARIO ---");
            for(Productos p : ListaProductos){
                System.out.println("ID: " + p.getId());
                System.out.println("Nombre: " + p.getNombre());
                System.out.println("Precio: " + p.getPrecio() + " DOP$");
                System.out.println("Cantidad: " + p.getCantidad());
                System.out.println("-------------------------");
            }
        }
    }
}