package poltaratskiy.web.crud.dto;

import lombok.Data;

import java.util.List;

@Data
public class AuthorDto {
    private Long id;
    private String name;
    List<Long> bookIds;
}
