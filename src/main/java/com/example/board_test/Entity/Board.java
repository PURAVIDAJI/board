package com.example.board_test.Entity;

import java.util.Date;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long seq;

    private String title;
    private String writer;
    private String content;

    @Column (name = "create_date",insertable = false, updatable = false, columnDefinition = "DATE DEFAULT SYSDATE")
    private Date createDate;

    @Column (insertable = false, updatable = false,columnDefinition = "NUMBER DEFAULT 0")
    private Long cnt;

}
