package com.cloudnativeplayground.aipoweredrecommendation.service;

import com.cloudnativeplayground.aipoweredrecommendation.model.UserBehavior;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserBehaviorServiceTest {

    private final UserBehaviorService userBehaviorService = new UserBehaviorService();

    @Test
    void testTrackBehavior() {
        UserBehavior behavior = new UserBehavior("user123", "item456", "click");

        userBehaviorService.trackBehavior(behavior);

        List<UserBehavior> behaviors = userBehaviorService.getUserBehaviors("user123");

        assertEquals(1, behaviors.size());
        assertEquals("item456", behaviors.get(0).getItemId());
    }
}
