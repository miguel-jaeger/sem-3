package com.semana3.app.repositorio;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

import org.springframework.stereotype.Repository;

import com.semana3.app.modelo.ProductoModelo;

@Repository

public class ProductoRepositorio {
    private final List<ProductoModelo> productos = new ArrayList<>();

    public ProductoRepositorio() {
        productos.add(new ProductoModelo(1L, "Laptop", 1500.0));
        productos.add(new ProductoModelo(2L, "Mouse", 25.0));
    }

    public List<ProductoModelo> obtenerTodos() {
        return productos;
    }

    public void agregarProducto(ProductoModelo producto) {
        productos.add(producto);
    }

    public void eliminarProducto(Long id) {
        Iterator<ProductoModelo> iterator = productos.iterator();
        while (iterator.hasNext()) {
            ProductoModelo producto = iterator.next();
            if (producto.getId().equals(id)) {
                iterator.remove(); // Elimina el producto de la lista
                System.out.println("Producto con id " + id + " eliminado.");
                return;
            }
        }
        System.out.println("Producto no encontrado con el id " + id);
    }
}
