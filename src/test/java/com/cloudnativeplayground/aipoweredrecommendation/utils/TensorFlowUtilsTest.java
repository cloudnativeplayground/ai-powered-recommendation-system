package com.cloudnativeplayground.aipoweredrecommendation.utils;

import org.junit.jupiter.api.Test;
import org.tensorflow.Tensor;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class TensorFlowUtilsTest {

    @Test
    void testLoadModel() {
        String modelPath = "config/tensorflow-model/recommendation_model";
        Object model = TensorFlowUtils.loadModel(modelPath);

        assertNotNull(model);
    }

    @Test
    void testRunInference() {
        Tensor inputTensor = Tensor.create(new float[]{1.0f, 2.0f, 3.0f});
        Object model = TensorFlowUtils.loadModel("config/tensorflow-model/recommendation_model");

        Tensor outputTensor = TensorFlowUtils.runInference(model, inputTensor);

        assertNotNull(outputTensor);
    }
}
