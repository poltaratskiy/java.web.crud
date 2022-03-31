package poltaratskiy.web.crud.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import poltaratskiy.web.crud.dto.BookDto;
import poltaratskiy.web.crud.model.Book;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-01T00:41:34+0300",
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
        book.setAuthorName( bookDto.getAuthorName() );
        book.setName( bookDto.getName() );

        return book;
    }

    @Override
    public BookDto toDto(Book book) {
        if ( book == null ) {
            return null;
        }

        BookDto bookDto = new BookDto();

        bookDto.setId( book.getId() );
        bookDto.setAuthorName( book.getAuthorName() );
        bookDto.setName( book.getName() );

        return bookDto;
    }
}
