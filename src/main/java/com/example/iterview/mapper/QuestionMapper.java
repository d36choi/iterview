package com.example.iterview.mapper;

import com.example.iterview.model.Question;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface QuestionMapper {
    Question selectQuestionById(int id);
    List<Question> selectAllQuestion();
    void insertQuestion(Question question);
}
