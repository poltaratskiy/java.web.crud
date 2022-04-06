package poltaratskiy.web.crud.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookSearchRequestDto {
    private String authorName;
    private String bookName;
}
