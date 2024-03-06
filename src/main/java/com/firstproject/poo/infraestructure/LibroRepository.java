package com.firstproject.poo.infraestructure;

import com.firstproject.poo.domain.entities.Libro;
import com.firstproject.poo.domain.repositories.LibroCrudRepository;

import java.util.List;

public class LibroRepository {
    public LibroCrudRepository libroRepo;

    public List<Libro> obtenerTodo(){
        return (List<Libro>) libroRepo.findAll();
    }
    public Libro save(Libro libro){
        return libroRepo.save(libro);
    }

    public void delete(Libro libro){
        libroRepo.delete(libro);
    }

    public List<Libro> obtenerByAnio(int anio){
        return libroRepo.findByAnioPublicacion(anio);
    }

}
