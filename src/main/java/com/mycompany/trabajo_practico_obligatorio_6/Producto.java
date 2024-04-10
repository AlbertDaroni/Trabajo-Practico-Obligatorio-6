package com.mycompany.trabajo_practico_obligatorio_6;
public class Producto implements Comparable<Producto>{
    private int codigo, stock;
    private double precio;
    private String descripcion;
    private Categoria rubro;

    public Producto() {}

    public Producto(int codigo, int stock, double precio, String descripcion, Categoria rubro) {
        this.codigo = codigo;
        this.stock = stock;
        this.precio = precio;
        this.descripcion = descripcion;
        this.rubro = rubro;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Categoria getRubro() {
        return rubro;
    }
    public void setRubro(Categoria rubro) {
        this.rubro = rubro;
    }

    @Override
    public int compareTo(Producto producto) {
        if(codigo > producto.codigo){
            return 1;
        }else if(codigo == producto.codigo){
            return 0;
        }else{
            return -1;
        }
    }
}
