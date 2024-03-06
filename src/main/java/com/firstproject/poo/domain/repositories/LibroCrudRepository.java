package com.firstproject.poo.domain.repositories;

import com.firstproject.poo.domain.entities.Libro;
import org.springframework.data.repository.CrudRepository;

public interface LibroCrudRepository extends CrudRepository<Libro,Long> {

}
