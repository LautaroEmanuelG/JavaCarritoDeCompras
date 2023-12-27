package com.cdf.ProyectoThyleaf.Moduls.Producto;

public class Comestible extends Producto {
    private String descripcion;

    public Comestible(String nombre, int id, Double precioBase, String img, String descripcion) {
        super(nombre, id, precioBase, img);
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
