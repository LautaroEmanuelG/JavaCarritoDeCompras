package com.cdf.ProyectoThyleaf.Moduls.Producto;

public class Ropa extends Producto{
    private String talla;
    public Ropa(String nombre, Double precioBase, String talla) {
        super(nombre, precioBase);
        this.talla = talla;
    }
}
