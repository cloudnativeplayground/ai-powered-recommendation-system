package com.cloudnativeplayground.aipoweredrecommendation.service;

import com.cloudnativeplayground.aipoweredrecommendation.utils.TensorFlowUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecommendationService {

    private final TensorFlowUtils tensorFlowUtils;

    public RecommendationService(TensorFlowUtils tensorFlowUtils) {
        this.tensorFlowUtils = tensorFlowUtils;
    }

    public List<String> getRecommendations(String userId) {
        return tensorFlowUtils.getRecommendations(userId);
    }
}
