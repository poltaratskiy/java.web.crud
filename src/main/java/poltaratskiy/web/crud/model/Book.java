package poltaratskiy.web.crud.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(name = "books")
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // @Column(name = "author_id", insertable = false, updatable = false)
    // private Long authorId;
    private String authorName;
    private String name;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;
}