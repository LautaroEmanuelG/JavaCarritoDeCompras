package com.cdf.ProyectoThyleaf.Moduls.Producto;

import com.cdf.ProyectoThyleaf.Moduls.Vendible;

public class Producto implements Vendible {
    String nombre;
    String img;
    int stock;
    Double precioBase;
    @Override
    public Double calcularPrecio() {
        return precioBase;
    }
    public Producto(String nombre, String img, int stock, Double precioBase) {
        this.nombre = nombre;
        this.img = img;
        this.stock = stock;
        this.precioBase = precioBase;
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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }
}
