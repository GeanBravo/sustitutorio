package com.example._000133420.domain.services;

import com.example._000133420.domain.entities.Producto;

import java.util.List;

public interface ProductoService {
    Producto create(Producto producto);
    List<Producto> getAll();
    Producto getByCodigo(String dni);
    Producto update(Producto producto);
}
