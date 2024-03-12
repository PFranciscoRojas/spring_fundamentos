package com.firstproject.poo.infraestructure.mapper;

import com.firstproject.poo.domain.dto.Book;
import com.firstproject.poo.infraestructure.entities.Libro;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;
import java.util.Optional;

@Mapper(componentModel = "spring")
public interface BookMapper {
    @Mappings({
            @Mapping(source = "idLibro", target ="bookID"),
            @Mapping(source = "titulo", target ="title"),
            @Mapping(source = "anioPublicacion", target ="publicationYear"),
            @Mapping(source = "precio", target ="price")
    })
    Book toBook(Libro libro);
    List<Book> toBooks(List<Libro> libros);
    Optional<Book> toBooksOptional(Optional<Libro> libro);
    @InheritInverseConfiguration
    Libro toLibro(Book book);
}
