package poltaratskiy.web.crud.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import poltaratskiy.web.crud.dto.AuthorDto;
import poltaratskiy.web.crud.dto.BookDto;
import poltaratskiy.web.crud.service.AuthorService;
import poltaratskiy.web.crud.service.BookService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/authors")
public class AuthorController {
    private final AuthorService authorService;
    private final BookService bookService;

    @GetMapping
    public List<AuthorDto> getAuthors() {
        return authorService.getAuthors();
    }

    @GetMapping(value = "/{authorId}/books")
    public List<BookDto> getBooksByAuthorId(@RequestParam Long authorId) {
        return bookService.findBooksByAuthorId(authorId);
    }

    @PostMapping
    public AuthorDto addAuthor(@RequestBody AuthorDto authorDto) {
        return authorService.createAuthor(authorDto);
    }

    @PutMapping
    public AuthorDto updateAuthor(@RequestBody AuthorDto authorDto) {
        return authorService.updateAuthor(authorDto);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteAuthor(@RequestParam Long id) {
        authorService.delete(id);
    }
}
