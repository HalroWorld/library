package com.bong.library.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name= "book_info")
@Getter
public class BookInfo {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "check_out")
    private String checkOut;

}
