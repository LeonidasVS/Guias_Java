/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author everc
 */

public class Articulo {
    private int idArticulo;
    private int categoria_Id;
    private String codigo;
    private String nombre;
    private double precio_venta;
    private int stock ;
    private String descripcion; 
    private String  imagen; 
    private boolean estado;

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public int getCategoria_id() {
        return categoria_Id;
    }

    public void setCategoria_id(int categoria_Id) {
        this.categoria_Id = categoria_Id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getDesscriocion() {
        return descripcion;
    }

    public void setDesscriocion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Articulo() {
    }

    public Articulo(int idArticulo, int categoria_id, String codigo, String nombre, double precio_venta, int stock, String desscriocion, String imagen, boolean estado) {
        this.idArticulo = idArticulo;
        this.categoria_Id = categoria_id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio_venta = precio_venta;
        this.stock = stock;
        this.descripcion = desscriocion;
        this.imagen = imagen;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Articulo{" + "idArticulo=" + idArticulo + ", categoria_id=" + categoria_Id + ", codigo=" + codigo + ", nombre=" + nombre + ", precio_venta=" + precio_venta + ", stock=" + stock + ", desscriocion=" + descripcion+ ", imagen=" + imagen + ", estado=" + estado + '}';
    }
    
}
