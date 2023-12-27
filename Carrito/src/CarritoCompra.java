import java.util.ArrayList;
import java.util.List;

public class CarritoCompra {
    private Cliente cliente;
    private List<Vendible> productos = new ArrayList<>();

    public CarritoCompra(Cliente cliente) {
        this.cliente = cliente;
    }

    public void agregarProducto(Vendible producto) {
        productos.add(producto);
    }

    public double calcularTotal() {
        //double total = 0;
        double total = 0;
        for (Vendible producto : productos) {
            //total += producto.calcularPrecio();
            total += cliente.realizarCompra(producto);
        }
        return total;
    }

    //lista de productos agregados
    public void mostrarProductos(){
        for (Vendible producto : productos){
            System.out.println(producto);
        }
    }
}