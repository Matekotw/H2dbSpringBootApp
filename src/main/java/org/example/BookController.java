package org.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public List<book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @PostMapping
    public book createBook(@RequestBody book book) {
        return bookService.saveBook(book);
    }


}
