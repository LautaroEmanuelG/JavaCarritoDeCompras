package com.cdf.ProyectoThyleaf.Moduls.Cliente;

import com.cdf.ProyectoThyleaf.Moduls.Vendible;

public class ClienteRegular implements Cliente {
    String nombre;

    public ClienteRegular(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public double realizarCompra(Vendible producto) {
        return producto.calcularPrecio();
    }
}
