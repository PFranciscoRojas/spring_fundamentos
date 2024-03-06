package com.firstproject.poo.infraestructure;

import com.firstproject.poo.domain.entities.Libro;
import com.firstproject.poo.domain.repositories.LibroCrudRepository;

import java.util.List;

public class LibroRepository {
    public LibroCrudRepository libroRepo;

    public List<Libro> obtenerTodo(){
        return (List<Libro>) libroRepo.findAll();
    }
}
