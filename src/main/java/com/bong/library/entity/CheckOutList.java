package com.bong.library.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name= "check_out_list")
@Getter
public class CheckOutList {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_info_id", updatable = false, insertable = false)
    private BookInfo bookInfo;

    @Column(name="book_info_id")
    private Long bookInfoId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id", updatable = false, insertable = false)
    private Member member;

    @Column(name="member_id")
    private Long memberId;


}
