package poltaratskiy.web.crud.mapper;

import org.mapstruct.Mapper;
import poltaratskiy.web.crud.dto.AuthorDto;
import poltaratskiy.web.crud.model.Author;

@Mapper
public interface AuthorMapper {
    Author toAuthor(AuthorDto authorDto);
    AuthorDto toAuthorDto(Author author);
}
