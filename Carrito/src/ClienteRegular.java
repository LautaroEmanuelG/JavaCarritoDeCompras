public class ClienteRegular implements Cliente {
    private String nombre;

    public ClienteRegular(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public double realizarCompra(Vendible producto) {
        return producto.calcularPrecio() *1.1;
    }
}
