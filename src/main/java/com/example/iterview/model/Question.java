package com.example.iterview.model;

import lombok.*;
import org.apache.ibatis.type.Alias;

@Data
@Alias("question")
@Getter @Setter @ToString
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Question {
    private int id;
    private String query;
    private int tagId;
    private String answer;

    public Question(String query, int tagId, String answer) {
        this.query = query;
        this.tagId = tagId;
        this.answer = answer;
    }
}
