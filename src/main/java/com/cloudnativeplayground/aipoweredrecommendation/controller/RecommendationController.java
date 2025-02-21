package com.cloudnativeplayground.aipoweredrecommendation.controller;

import com.cloudnativeplayground.aipoweredrecommendation.service.RecommendationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recommendations")
public class RecommendationController {

    @Autowired
    private RecommendationService recommendationService;

    @GetMapping("/{userId}")
    public List<String> getRecommendations(@PathVariable String userId) {
        return recommendationService.getRecommendations(userId);
    }
}
