package com.cdf.ProyectoThyleaf.Moduls.Producto;

import com.cdf.ProyectoThyleaf.Moduls.Vendible;

public class Producto implements Vendible {
    private String nombre;
    private int id;
    private Double precioBase;
    private String img;
    public Producto(String nombre, int id,  Double precioBase , String img) {
        this.nombre = nombre;
        this.img = img;
        this.precioBase = precioBase;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    @Override
    public double calcularPrecio() {
        return precioBase;
    }
}
