package poltaratskiy.web.crud.mapper;

import org.mapstruct.Mapper;
import poltaratskiy.web.crud.dto.BookDto;
import poltaratskiy.web.crud.model.Book;

@Mapper
public interface BookMapper {
    Book toBook(BookDto bookDto);
    BookDto toDto(Book book);
}
