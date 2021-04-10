package com.mini.mbti.controller;

import com.mini.mbti.model.Mbti_type;
import com.mini.mbti.model.dto.ResultDto;
import com.mini.mbti.repository.Mbti_typeRepository;
import com.mini.mbti.service.Mbti_typeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class Mbti_typeController {
    private final Mbti_typeRepository mbti_typeRepository;
    private final Mbti_typeService mbti_typeService;


    @GetMapping("/api/mbti/make_type")
    public void make_db(){
        mbti_typeService.createDB();
    }
    @PostMapping("/api/mbti/result")
    public Mbti_type result(@RequestBody ResultDto resultDto){
        Mbti_type result = mbti_typeService.result(resultDto);
        return result;
    }
}
