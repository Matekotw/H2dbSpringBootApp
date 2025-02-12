package org.example;

import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Book;

public interface BookRepository extends JpaRepository<book, Long> {
}
