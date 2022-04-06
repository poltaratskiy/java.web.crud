package poltaratskiy.web.crud.repository;

import poltaratskiy.web.crud.model.Book;
import poltaratskiy.web.crud.model.BookSearchRequest;

import java.util.List;

public interface BookSearchRepository {
    public List<Book> findBooks(BookSearchRequest request);
}
