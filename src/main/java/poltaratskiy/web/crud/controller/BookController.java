package poltaratskiy.web.crud.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import poltaratskiy.web.crud.model.Book;
import poltaratskiy.web.crud.service.BookService;

import java.util.List;

@RestController
@RequestMapping("/api/books")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @GetMapping(value = "/search/{searchRequest}")
    public List<Book> getBook(@PathVariable String searchRequest) {
        System.out.println("Search request: " + searchRequest);
        return bookService.findBooks(searchRequest);
    }

    @GetMapping
    public List<Book> getAllBook() {
        return bookService.getBooks();
    }

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        System.out.println("Book for save to database, author: " + book.getAuthor() + ", name: " + book.getName());
        return bookService.createBook(book);
    }

    @PutMapping
    public Book updateBook(@RequestBody Book book) {
        System.out.println("Book for update, id: " + book.getId());
        return bookService.updateBook(book);
    }

    @DeleteMapping(value = "/{id}")
    public void removeBook(@PathVariable long id) {
        System.out.println("Book for remove, id: " + id);
        bookService.delete(id);
    }
}
