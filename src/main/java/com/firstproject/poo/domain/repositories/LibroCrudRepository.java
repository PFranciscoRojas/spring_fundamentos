package com.firstproject.poo.domain.repositories;

import com.firstproject.poo.domain.entities.Libro;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LibroCrudRepository extends CrudRepository<Libro,Long> {
    List<Libro> findByAnioPublicacion(int anioPublicacion);

}
