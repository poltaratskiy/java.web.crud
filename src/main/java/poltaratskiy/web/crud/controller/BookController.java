package poltaratskiy.web.crud.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import poltaratskiy.web.crud.dto.BookDto;
import poltaratskiy.web.crud.dto.BookSearchRequestDto;
import poltaratskiy.web.crud.service.BookService;

import java.util.List;

@RestController
@RequestMapping("/api/books")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @PostMapping(value = "/search")
    public List<BookDto> getBook(@RequestBody BookSearchRequestDto searchRequest) {
        System.out.println("Search request: " + searchRequest);
        return bookService.findBooks(searchRequest);
    }

    @GetMapping
    public List<BookDto> getAllBook() {
        return bookService.getBooks();
    }

    @PostMapping
    public BookDto addBook(@RequestBody BookDto bookDto) {
        System.out.println("Book for save to database, author: " + bookDto.getAuthor().getName() + ", name: " + bookDto.getName());
        return bookService.createBook(bookDto);
    }

    @PutMapping
    public BookDto updateBook(@RequestBody BookDto bookDto) {
        System.out.println("Book for update, id: " + bookDto.getId());
        return bookService.updateBook(bookDto);
    }

    @DeleteMapping(value = "/{id}")
    public void removeBook(@PathVariable long id) {
        System.out.println("Book for remove, id: " + id);
        bookService.delete(id);
    }
}
