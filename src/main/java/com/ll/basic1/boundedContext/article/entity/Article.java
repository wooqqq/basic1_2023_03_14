package com.ll.basic1.boundedContext.article.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = IDENTITY) // AUTO_INCREMENT
    private long id;
    private LocalDateTime createDate; // 데이터 생성 날짜
    private LocalDateTime modifyDate; // 데이터 수정 날짜
    private String title;
    private String body;
}