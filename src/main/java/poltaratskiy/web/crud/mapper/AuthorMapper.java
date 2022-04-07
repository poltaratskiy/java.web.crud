package poltaratskiy.web.crud.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import poltaratskiy.web.crud.dto.AuthorDto;
import poltaratskiy.web.crud.model.Author;
import poltaratskiy.web.crud.model.Book;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface AuthorMapper {
    Author toAuthor(AuthorDto authorDto);

    @Mapping(source = "books", target = "bookIds", qualifiedByName = "bookListToBookIdsList")
    AuthorDto toAuthorDto(Author author);

    @Named("bookListToBookIdsList")
    static List<Long> bookListToBookIdsList(List<Book> books) {
        var bookIds = new ArrayList<Long>(books.size());
        for (var book : books) {
            bookIds.add(book.getId());
        }

        return bookIds;
    }
}
