package com.firstproject.poo.domain.repositories;

import com.firstproject.poo.domain.entities.Libro;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface LibroPaginateRepository extends PagingAndSortingRepository<Libro,Long> {
}
