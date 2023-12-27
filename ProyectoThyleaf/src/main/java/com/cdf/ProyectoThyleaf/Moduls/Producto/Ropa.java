package com.cdf.ProyectoThyleaf.Moduls.Producto;

public class Ropa extends Producto{
    private String talla;

    public Ropa(String nombre, int id, Double precioBase, String img, String talla) {
        super(nombre, id, precioBase,  img);
        this.talla = talla;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }
}
