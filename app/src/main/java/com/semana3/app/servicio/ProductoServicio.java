package com.semana3.app.servicio;

import java.util.List;

import org.springframework.stereotype.Service;

import com.semana3.app.modelo.ProductoModelo;
import com.semana3.app.repositorio.ProductoRepositorio;

@Service
public class ProductoServicio {
    private final ProductoRepositorio productoRepositorio;

    public ProductoServicio(ProductoRepositorio productoRepositorio) {
        this.productoRepositorio = productoRepositorio;
    }

     public List<ProductoModelo> listarProductos() {
        return productoRepositorio.obtenerTodos();
    }
    
    public void agregarProducto(ProductoModelo producto) {
        productoRepositorio.agregarProducto(producto);
    }

    public void eliminarProducto(Long id) {
        productoRepositorio.eliminarProducto(id);
    }


}
