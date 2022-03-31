package poltaratskiy.web.crud.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import poltaratskiy.web.crud.dto.AuthorDto;
import poltaratskiy.web.crud.mapper.AuthorMapper;
import poltaratskiy.web.crud.repository.AuthorRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorService {
    private final AuthorRepository authorRepository;
    private final AuthorMapper authorMapper;

    public List<AuthorDto> getAuthors() {
        return authorRepository.findAll().stream().map(x -> authorMapper.toAuthorDto(x)).toList();
    }

    public List<AuthorDto> findAuthorByName(String name) {
        return authorRepository.findByName(name).stream().map(x -> authorMapper.toAuthorDto(x)).toList();
    }

    public AuthorDto createAuthor(AuthorDto authorDto) {
        var author = authorMapper.toAuthor(authorDto);
        return authorMapper.toAuthorDto(authorRepository.save(author));
    }

    public AuthorDto updateAuthor(AuthorDto authorDto) {
        var author = authorMapper.toAuthor(authorDto);
        return authorMapper.toAuthorDto(authorRepository.save(author));
    }

    public void delete(Long id) {
        authorRepository.deleteById(id);
    }
}
