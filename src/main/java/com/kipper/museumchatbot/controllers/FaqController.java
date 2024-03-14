package com.kipper.museumchatbot.controllers;

import com.kipper.museumchatbot.dto.MessageRequest;
import com.kipper.museumchatbot.utils.FaqAnswers;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/chat")
public class FaqController {
    @PostMapping
    public ResponseEntity<String> answerQuestion(@RequestBody MessageRequest request){
        FaqAnswers faqAnswers = new FaqAnswers();
        System.out.println(faqAnswers.getAnswers().get(0).getAnswer());
        return ResponseEntity.ok("oi deu certo");
    }
}
