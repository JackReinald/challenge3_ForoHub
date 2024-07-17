package com.aluracursos.forohub_sumerpercadoapi.producto;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Entity(name = "Producto")
@Table(name = "productos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Producto { //Esta entidad/clase tiene la misión de mapear los que vienee del respectivo DTO hacia la database
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String titulo;
    private String mensaje;
    private String fechaDeCreacion;
    private Boolean estado;
    private String autor;

    @Enumerated(EnumType.STRING)
    CursoDeProducto curso;  // curso = tipo de producto


    public Producto(DatosRegistroProducto datosRegistroProducto) {
        this.titulo = datosRegistroProducto.titulo();
        this.mensaje = datosRegistroProducto.mensaje();
        this.fechaDeCreacion = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd, MMMM yyyy"));
        this.autor = datosRegistroProducto.autor();
        this.curso = datosRegistroProducto.curso();
    }

}
