package com.example.vertical.dto;

import lombok.Getter;

import java.sql.Timestamp;

@Getter
public class BoardSaveDto {
    private Long id;
    private String title;
    private String content;
    private Timestamp created_time;


}
