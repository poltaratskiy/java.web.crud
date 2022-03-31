package poltaratskiy.web.crud.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import poltaratskiy.web.crud.dto.AuthorDto;
import poltaratskiy.web.crud.dto.BookDto;
import poltaratskiy.web.crud.model.Author;
import poltaratskiy.web.crud.model.Book;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-01T00:41:34+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class AuthorMapperImpl implements AuthorMapper {

    @Override
    public Author toAuthor(AuthorDto authorDto) {
        if ( authorDto == null ) {
            return null;
        }

        Author author = new Author();

        author.setId( authorDto.getId() );
        author.setName( authorDto.getName() );
        author.setBooks( bookDtoListToBookList( authorDto.getBooks() ) );

        return author;
    }

    @Override
    public AuthorDto toAuthorDto(Author author) {
        if ( author == null ) {
            return null;
        }

        AuthorDto authorDto = new AuthorDto();

        authorDto.setId( author.getId() );
        authorDto.setName( author.getName() );
        authorDto.setBooks( bookListToBookDtoList( author.getBooks() ) );

        return authorDto;
    }

    protected Book bookDtoToBook(BookDto bookDto) {
        if ( bookDto == null ) {
            return null;
        }

        Book book = new Book();

        book.setId( bookDto.getId() );
        book.setAuthorName( bookDto.getAuthorName() );
        book.setName( bookDto.getName() );

        return book;
    }

    protected List<Book> bookDtoListToBookList(List<BookDto> list) {
        if ( list == null ) {
            return null;
        }

        List<Book> list1 = new ArrayList<Book>( list.size() );
        for ( BookDto bookDto : list ) {
            list1.add( bookDtoToBook( bookDto ) );
        }

        return list1;
    }

    protected BookDto bookToBookDto(Book book) {
        if ( book == null ) {
            return null;
        }

        BookDto bookDto = new BookDto();

        bookDto.setId( book.getId() );
        bookDto.setAuthorName( book.getAuthorName() );
        bookDto.setName( book.getName() );

        return bookDto;
    }

    protected List<BookDto> bookListToBookDtoList(List<Book> list) {
        if ( list == null ) {
            return null;
        }

        List<BookDto> list1 = new ArrayList<BookDto>( list.size() );
        for ( Book book : list ) {
            list1.add( bookToBookDto( book ) );
        }

        return list1;
    }
}
