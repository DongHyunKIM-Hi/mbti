package com.mini.mbti.controller;

import com.mini.mbti.model.Mbti_test;
import com.mini.mbti.repository.Mbti_testRepository;
import com.mini.mbti.service.Mbti_testService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class Mbti_testController {
    private final Mbti_testRepository mbti_testRepository;
    private final Mbti_testService mbti_testService;

    @GetMapping("/api/mbti/make_test")
    public void create(){
        mbti_testService.createDB();
    }

    @GetMapping("/api/mbti/start")
    public List<Mbti_test> test_list(){
        return mbti_testRepository.findAll();
    }
}
