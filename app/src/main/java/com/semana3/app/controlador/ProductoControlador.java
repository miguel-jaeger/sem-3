package com.semana3.app.controlador;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.semana3.app.modelo.ProductoModelo;
import com.semana3.app.servicio.ProductoServicio;

@RestController
@RequestMapping("/productos")
public class ProductoControlador {
    private final ProductoServicio productoServicio;

    public ProductoControlador(ProductoServicio productoServicio) {
        this.productoServicio = productoServicio;
    }

    @GetMapping
    public List<ProductoModelo> obtenerProductos() {
        return productoServicio.listarProductos();
    }

    @PostMapping
    public void agregarProducto(@RequestBody ProductoModelo producto) {
        productoServicio.agregarProducto(producto);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarProducto(@PathVariable Long id) {
        productoServicio.eliminarProducto(id);
    }

}
