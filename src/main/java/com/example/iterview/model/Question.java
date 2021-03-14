package com.example.iterview.model;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("question")
public class Question {
    private Long id;
    private String query;
    private int tagId;
    private String answer;
}
