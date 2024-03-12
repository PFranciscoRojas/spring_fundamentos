package com.firstproject.poo.infraestructure.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Libros")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_libro")
    private Long idLibro;

    private String titulo;
    @Column(name = "anio_publicacion")
    private Integer anioPublicacion;
    private Double precio;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_autor", nullable = false)
    private Autor autor;

    // Getters y setters
}

