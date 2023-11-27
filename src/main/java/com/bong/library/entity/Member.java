package com.bong.library.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name= "member")
@Getter
public class Member extends BaseTimeEntity{
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "member_id")
    private String memberId;
    @Column(name = "password")
    private String password;
}
