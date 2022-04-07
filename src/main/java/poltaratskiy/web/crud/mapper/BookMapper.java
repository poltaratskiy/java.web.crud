package poltaratskiy.web.crud.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import poltaratskiy.web.crud.dto.BookDto;
import poltaratskiy.web.crud.model.Book;

@Mapper
public interface BookMapper {
    Book toBook(BookDto bookDto);

    @Mapping(target = "authorId", source = "author.id")
    BookDto toDto(Book book);
}
