package com.example._000133420.application.controllers;

import com.example._000133420.domain.entities.Producto;
import com.example._000133420.domain.services.ProductoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "productos")
@AllArgsConstructor
@CrossOrigin({ origins: "*" })
public class ProductoController {
    private ProductoService productoService;
    @PostMapping
    ResponseEntity<Producto> create(@RequestBody Producto producto) {
        Producto producto1 = this.productoService.create(producto);
        return new ResponseEntity<>(producto1, HttpStatus.CREATED);
    }

    @GetMapping()
    ResponseEntity<List<Producto>> getByAll(){
        List<Producto> productos = this.productoService.getAll();
        return new ResponseEntity<>(productos, HttpStatus.CREATED);
    }
}
