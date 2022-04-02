package poltaratskiy.web.crud.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import poltaratskiy.web.crud.dto.AuthorDto;
import poltaratskiy.web.crud.dto.BookDto;
import poltaratskiy.web.crud.model.Author;
import poltaratskiy.web.crud.model.Book;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-03T00:07:38+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class BookMapperImpl implements BookMapper {

    @Override
    public Book toBook(BookDto bookDto) {
        if ( bookDto == null ) {
            return null;
        }

        Book book = new Book();

        book.setId( bookDto.getId() );
        book.setAuthorId( bookDto.getAuthorId() );
        book.setAuthorName( bookDto.getAuthorName() );
        book.setName( bookDto.getName() );
        book.setAuthor( authorDtoToAuthor( bookDto.getAuthor() ) );

        return book;
    }

    @Override
    public BookDto toDto(Book book) {
        if ( book == null ) {
            return null;
        }

        BookDto bookDto = new BookDto();

        bookDto.setId( book.getId() );
        bookDto.setAuthorId( book.getAuthorId() );
        bookDto.setAuthorName( book.getAuthorName() );
        bookDto.setName( book.getName() );
        bookDto.setAuthor( authorToAuthorDto( book.getAuthor() ) );

        return bookDto;
    }

    protected Author authorDtoToAuthor(AuthorDto authorDto) {
        if ( authorDto == null ) {
            return null;
        }

        Author author = new Author();

        author.setId( authorDto.getId() );
        author.setName( authorDto.getName() );

        return author;
    }

    protected AuthorDto authorToAuthorDto(Author author) {
        if ( author == null ) {
            return null;
        }

        AuthorDto authorDto = new AuthorDto();

        authorDto.setId( author.getId() );
        authorDto.setName( author.getName() );

        return authorDto;
    }
}
