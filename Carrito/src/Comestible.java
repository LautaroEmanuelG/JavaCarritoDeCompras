public class Comestible extends Producto {
    private String descripcion;

    public Comestible(String nombre, double precioBase, String descripcion) {
        super(nombre, precioBase);
        this.descripcion = descripcion;
    }

    @Override
    public double calcularPrecio() {
        return super.calcularPrecio() * 0.1 + super.calcularPrecio();
    }
}