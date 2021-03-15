package com.example.iterview.controller;

import com.example.iterview.dto.QuestionDto;
import com.example.iterview.model.Question;
import com.example.iterview.service.QuestionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@ResponseBody
@RequestMapping("/question")
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

    @GetMapping("/all")
    public List<Question> getAllQuestion() {
        return questionService.getAllQuestion();
    }

    @PostMapping("/add")
    public ResponseEntity<String> addQuestion(@RequestBody QuestionDto questionDto) {
        questionService.addQuestion(questionDto);
        return new ResponseEntity<>("adding success",HttpStatus.OK);
    }
}
