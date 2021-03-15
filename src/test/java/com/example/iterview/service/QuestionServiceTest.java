package com.example.iterview.service;

import com.example.iterview.model.Question;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
@Transactional
class QuestionServiceTest {

    @Autowired
    QuestionService questionService;

    @Test
    void addQuestion() {
        questionService.addQuestion(new Question("test",1,"answer"));
    }

    @Test
    void getQuestionById() {
        log.info(questionService.getQuestionById(2).toString());
        assertThat(questionService.getQuestionById(2).getQuery()).isEqualTo("queryTest");
    }

    @Test
    void getAllQuestion() {
        log.info(questionService.getAllQuestion().toString());
    }


}