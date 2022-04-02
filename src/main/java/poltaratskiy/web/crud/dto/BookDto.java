package poltaratskiy.web.crud.dto;

import lombok.Data;

@Data
public class BookDto {
    private Long id;
    private Long authorId;
    private String authorName;
    private String name;
    private AuthorDto author;
}
