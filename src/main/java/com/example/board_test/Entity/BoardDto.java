package com.example.board_test.Entity;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardDto {
    private Long seq;
    private String title;
    private String content;
}
