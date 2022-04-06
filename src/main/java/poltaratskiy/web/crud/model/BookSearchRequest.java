package poltaratskiy.web.crud.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookSearchRequest {
    private String authorName;
    private String bookName;
}
