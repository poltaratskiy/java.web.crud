package poltaratskiy.web.crud.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import poltaratskiy.web.crud.dto.AuthorDto;
import poltaratskiy.web.crud.model.Author;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-03T00:07:38+0300",
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

        return authorDto;
    }
}
