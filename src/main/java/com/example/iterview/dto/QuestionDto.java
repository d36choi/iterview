package com.example.iterview.dto;

public class QuestionDto {
    private int id;
    private String query;
    private int tagId;
    private String answer;

    public QuestionDto(String query, int tagId, String answer) {
        this.query = query;
        this.tagId = tagId;
        this.answer = answer;
    }
}
