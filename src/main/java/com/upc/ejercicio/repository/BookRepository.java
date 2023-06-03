package com.upc.ejercicio.repository;

import com.upc.ejercicio.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByEditorial(String editorial);

    boolean existsByTitleAndEditorial(String title, String editorial);
}
