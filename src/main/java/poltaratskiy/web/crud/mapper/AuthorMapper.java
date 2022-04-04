package poltaratskiy.web.crud.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import poltaratskiy.web.crud.dto.AuthorDto;
import poltaratskiy.web.crud.model.Author;

@Mapper
public interface AuthorMapper {
    @Mapping(target = "books", ignore = true)
    Author toAuthor(AuthorDto authorDto);

    @Mapping(target = "books", ignore = true)
    AuthorDto toAuthorDto(Author author);
}
