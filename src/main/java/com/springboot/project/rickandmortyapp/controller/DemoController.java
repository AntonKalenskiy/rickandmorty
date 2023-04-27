package com.springboot.project.rickandmortyapp.controller;

import com.springboot.project.rickandmortyapp.dto.ApiResponseDto;
import com.springboot.project.rickandmortyapp.service.HttpClient;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
@RequestMapping("/demo")
public class DemoController {
    private final HttpClient httpClient;

    public DemoController(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    @GetMapping
    public String runDemo() {
        ApiResponseDto apiResponseDto = httpClient.get("https://rickandmortyapi.com/api/character",
                ApiResponseDto.class);
        log.info("Api response {}", apiResponseDto);
        return "Done!";
    }
}
