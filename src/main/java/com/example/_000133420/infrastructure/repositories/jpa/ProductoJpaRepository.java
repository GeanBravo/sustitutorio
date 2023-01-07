package com.example._000133420.infrastructure.repositories.jpa;

import com.example._000133420.domain.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoJpaRepository extends JpaRepository<Producto, Long> {
    Producto getByCodigo(String dni);
}
