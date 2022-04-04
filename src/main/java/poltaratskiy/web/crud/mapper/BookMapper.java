package poltaratskiy.web.crud.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import poltaratskiy.web.crud.dto.BookDto;
import poltaratskiy.web.crud.model.Book;

@Mapper
public interface BookMapper {
    @Mapping(target = "author.books", ignore = true)
    Book toBook(BookDto bookDto);

    @Mapping(target = "author.books", ignore = true)
    BookDto toDto(Book book);
}
