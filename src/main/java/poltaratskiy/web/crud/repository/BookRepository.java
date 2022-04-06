package poltaratskiy.web.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import poltaratskiy.web.crud.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>, BookSearchRepository {
    List<Book> findByAuthorOrName(String author, String name);
    List<Book> findByAuthorId(Long authorId);
}
