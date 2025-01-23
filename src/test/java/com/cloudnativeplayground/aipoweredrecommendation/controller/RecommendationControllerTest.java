package com.cloudnativeplayground.aipoweredrecommendation.controller;

import com.cloudnativeplayground.aipoweredrecommendation.service.RecommendationService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RecommendationControllerTest {

    @InjectMocks
    private RecommendationController recommendationController;

    @Mock
    private RecommendationService recommendationService;

    @Test
    void testGetRecommendations() {
        String userId = "user123";
        List<String> expectedResponse = Arrays.asList("item1", "item2");

        when(recommendationService.getRecommendations(userId)).thenReturn(expectedResponse);

        List<String> response = recommendationController.getRecommendations(userId);

        assertEquals(expectedResponse, response);
        //assertEquals(200, response.getStatusCodeValue());
    }
}
