package com.cdf.ProyectoThyleaf.Moduls.Producto;

public class Electronico extends Producto {
    private String marca;


    public Electronico(String nombre, int id, Double precioBase, String img, String marca) {
        super(nombre, id, precioBase, img);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}
