package com.example._000133420.infrastructure.repositories.impl;

import com.example._000133420.domain.entities.Producto;
import com.example._000133420.domain.repositories.ProductoRepository;
import com.example._000133420.infrastructure.repositories.jpa.ProductoJpaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class ProductoRepositoryImpl implements ProductoRepository {
    private ProductoJpaRepository productoJpaRepository;
    @Override
    public Producto save(Producto producto) {
        return this.productoJpaRepository.save(producto);
    }

    @Override
    public List<Producto> getAll() {
        return this.productoJpaRepository.findAll();
    }

    @Override
    public Producto getOne(Long id) {
        return this.productoJpaRepository.findById(id).get();
    }

    @Override
    public Producto getByCodigo(String codigo) {
        return this.productoJpaRepository.getByCodigo(codigo);
    }

    @Override
    public void delete(Long id) {
        this.productoJpaRepository.deleteById(id);
    }
}
