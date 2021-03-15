package com.example.iterview.controller;

import com.example.iterview.model.Question;
import com.example.iterview.service.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.Queue;

@ResponseBody
@RequestMapping("question/")
@RestController
public class QuestionController {

    QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping("/{id}")
    public Question getQuestionById(@PathVariable int id) {
        return questionService.getQuestionById(id);
    }
}
