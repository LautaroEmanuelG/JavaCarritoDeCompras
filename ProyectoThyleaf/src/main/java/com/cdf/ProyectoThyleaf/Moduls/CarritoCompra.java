package com.cdf.ProyectoThyleaf.Moduls;

import com.cdf.ProyectoThyleaf.Moduls.Cliente.Cliente;
import com.cdf.ProyectoThyleaf.Moduls.Producto.Producto;
import com.cdf.ProyectoThyleaf.Moduls.Producto.Vendible;

import java.util.ArrayList;
import java.util.List;

public class CarritoCompra {
    private Cliente cliente;
    private List<Producto> productos = new ArrayList<>();

    public CarritoCompra(Cliente cliente) {
        this.cliente = cliente;
    }
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.calcularPrecio();
            //total += cliente.realizarCompra(producto);
        }
        return total;
    }


    //lista de productos agregados
    public void mostrarProductos(){
        for (Producto producto : productos){
            System.out.println(producto);
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}
