package com.aluracursos.forohub_sumerpercadoapi.controller;

import com.aluracursos.forohub_sumerpercadoapi.producto.DatosListadoProducto;
import com.aluracursos.forohub_sumerpercadoapi.producto.DatosRegistroProducto;
import com.aluracursos.forohub_sumerpercadoapi.producto.IProductoRepository;
import com.aluracursos.forohub_sumerpercadoapi.producto.Producto;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoController {
    //llamar al repositorio
    @Autowired
    private IProductoRepository productoRepository;

    @PostMapping
    public void registrarProducto(@RequestBody @Valid DatosRegistroProducto datosRegistroProducto){
        productoRepository.save(new Producto(datosRegistroProducto));
    }
    @GetMapping
    public List<DatosListadoProducto> obtenerProducto(){
       return productoRepository.findAll().stream().map(DatosListadoProducto::new).toList();
    }

}
