package com.example.iterview.repository;

import com.example.iterview.model.Question;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface QuestionMapper {
    Question selectQuestionById(Long id);
    List<Question> selectAllQuestion();
    void insertQuestion(Question question);
}
