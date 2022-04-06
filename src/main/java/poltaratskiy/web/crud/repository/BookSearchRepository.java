package poltaratskiy.web.crud.repository;

import poltaratskiy.web.crud.dto.BookSearchRequestDto;
import poltaratskiy.web.crud.model.Book;

import java.util.List;

public interface BookSearchRepository {
    public List<Book> findBooks(BookSearchRequestDto request);
}
