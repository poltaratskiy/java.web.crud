package poltaratskiy.web.crud.repository.book;

import lombok.RequiredArgsConstructor;
import poltaratskiy.web.crud.dto.BookSearchRequestDto;
import poltaratskiy.web.crud.model.Author;
import poltaratskiy.web.crud.model.Book;

import javax.persistence.EntityManager;
import javax.persistence.criteria.Join;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class BookSearchRepositoryImpl implements BookSearchRepository {
    private EntityManager entityManager;

    @Override
    public List<Book> findBooks(BookSearchRequestDto request) {
        var builder = entityManager.getCriteriaBuilder();
        var criteriaQuery = builder.createQuery(Book.class);
        var root = criteriaQuery.from(Book.class);
        Join<Book, Author> joinAuthor = root.join("author");
        var query = criteriaQuery.select(root);

        Optional.ofNullable(request.getAuthorName())
                .ifPresent(author -> query.where(builder.like(joinAuthor.get("name"), request.getAuthorName())));

        Optional.ofNullable(request.getBookName())
                .ifPresent(author -> query.where(builder.like(root.get("name"), request.getBookName())));

        return entityManager.createQuery(query).getResultList();
    }
}
