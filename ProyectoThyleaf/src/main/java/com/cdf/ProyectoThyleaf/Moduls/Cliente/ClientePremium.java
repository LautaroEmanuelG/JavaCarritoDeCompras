package com.cdf.ProyectoThyleaf.Moduls.Cliente;

import com.cdf.ProyectoThyleaf.Moduls.Vendible;

public class ClientePremium implements Cliente {
    private String nombre;

    public ClientePremium(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public double realizarCompra(Vendible producto) {
        return producto.calcularPrecio() * 0.8;
    }
}
