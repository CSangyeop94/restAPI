package com.example.restapi.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String LastName;


    @JsonBackReference
    @OneToMany(mappedBy = "author",
            fetch= FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Book> books;
}
