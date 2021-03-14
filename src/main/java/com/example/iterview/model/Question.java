package com.example.iterview.model;

import lombok.*;
import org.apache.ibatis.type.Alias;

@Data
@Alias("question")
@AllArgsConstructor
@Getter @Setter @ToString
@EqualsAndHashCode(of = "id")
public class Question {
    private Long id;
    private String query;
    private int tagId;
    private String answer;
}
