package poltaratskiy.web.crud.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import poltaratskiy.web.crud.model.Book;
import poltaratskiy.web.crud.repository.BookRepository;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;

    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    public List<Book> findBooks(String searchRequest) {
        return bookRepository.findByAuthorOrName(searchRequest, searchRequest);
    }

    public Book createBook(Book book) {
        bookRepository.save(book);
        return book;
    }

    public Book updateBook(Book book) {
        bookRepository.save(book);
        return book;
    }

    public void delete(Long id) {
        bookRepository.deleteById(id);
    }
}
