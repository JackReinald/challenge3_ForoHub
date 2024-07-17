package com.aluracursos.forohub_sumerpercadoapi.producto;

public record DatosListadoProducto(
        String titulo,
        String mensaje,
        String fechacreacion,
        Boolean estado,
        String autor,
        String curso) {


    public DatosListadoProducto(Producto producto) {
        this(producto.getTitulo(),producto.getMensaje(),producto.getFechaDeCreacion(),producto.getEstado(),
                producto.getAutor(),producto.getCurso().toString());
    }
}
