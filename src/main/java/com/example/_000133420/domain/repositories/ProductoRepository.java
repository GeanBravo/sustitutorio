package com.example._000133420.domain.repositories;

import com.example._000133420.domain.entities.Producto;

import java.util.List;

public interface ProductoRepository {
    Producto save(Producto producto);
    List<Producto> getAll();
    Producto getOne(Long id);
    Producto getByCodigo(String codigo);
    void delete(Long id);
}
