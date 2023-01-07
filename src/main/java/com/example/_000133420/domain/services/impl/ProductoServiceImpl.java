package com.example._000133420.domain.services.impl;

import com.example._000133420.domain.entities.Producto;
import com.example._000133420.domain.repositories.ProductoRepository;
import com.example._000133420.domain.services.ProductoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductoServiceImpl implements ProductoService {
    private ProductoRepository productoRepository;
    @Override
    public Producto create(Producto producto) {
        return this.productoRepository.save(producto);
    }

    @Override
    public List<Producto> getAll() {
        return this.productoRepository.getAll();
    }

    @Override
    public Producto getByCodigo(String dni) {
        return this.productoRepository.getByCodigo(dni);
    }

    @Override
    public Producto update(Producto producto) {
        return this.productoRepository.save(producto);
    }
}
