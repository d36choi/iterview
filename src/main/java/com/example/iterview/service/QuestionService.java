package com.example.iterview.service;

import com.example.iterview.model.Question;
import com.example.iterview.mapper.QuestionMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class QuestionService {
    QuestionMapper questionMapper;

    public QuestionService(QuestionMapper questionMapper) {
        this.questionMapper = questionMapper;
    }

    public Question getQuestionById(int id) {
        return questionMapper.selectQuestionById(id);
    }

    public List<Question> getAllQuestion() {
        return questionMapper.selectAllQuestion();
    }

    public void addQuestion(Question question) {
        questionMapper.insertQuestion(question);
    }
}
