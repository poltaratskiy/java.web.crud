package poltaratskiy.web.crud.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import poltaratskiy.web.crud.dto.BookDto;
import poltaratskiy.web.crud.dto.BookSearchRequestDto;
import poltaratskiy.web.crud.model.Book;
import poltaratskiy.web.crud.model.BookSearchRequest;

@Mapper
public interface BookMapper {
    @Mapping(target = "author.books", ignore = true)
    Book toBook(BookDto bookDto);

    @Mapping(target = "author.books", ignore = true)
    BookDto toDto(Book book);

    BookSearchRequest toBookSearchRequest(BookSearchRequestDto dto);
    BookSearchRequestDto toBookSearchRequestDto(BookSearchRequest entity);
}
