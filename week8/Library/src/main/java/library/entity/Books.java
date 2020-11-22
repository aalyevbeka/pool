package library.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "books")
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String bookName;
    private String descriptions;
    private  String author;

}
