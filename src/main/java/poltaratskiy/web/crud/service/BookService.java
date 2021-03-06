package poltaratskiy.web.crud.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import poltaratskiy.web.crud.dto.BookDto;
import poltaratskiy.web.crud.dto.BookSearchRequestDto;
import poltaratskiy.web.crud.mapper.BookMapper;
import poltaratskiy.web.crud.model.Book;
import poltaratskiy.web.crud.repository.book.BookRepository;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    public List<BookDto> getBooks() {
        return bookRepository.findAll()
                .stream()
                .map(bookMapper::toDto)
                .collect(Collectors.toList());
    }

    public List<BookDto> findBooks(BookSearchRequestDto searchRequest) {
        var result = bookRepository.findBooks(searchRequest);
        return result.stream().map(bookMapper::toDto).toList();
    }

    public List<BookDto> findBooksByAuthorId(Long authorId) {
        return bookRepository.findByAuthorId(authorId).stream().map(bookMapper::toDto).toList();
    }

    public BookDto createBook(BookDto bookDto) {
        Book book = bookMapper.toBook(bookDto);
        return bookMapper.toDto(bookRepository.save(book));
    }

    public BookDto updateBook(BookDto bookDto) {
        var book = bookMapper.toBook(bookDto);
        return bookMapper.toDto(bookRepository.save(book));
    }

    public void delete(Long id) {
        bookRepository.deleteById(id);
    }
}
