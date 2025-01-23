package com.cloudnativeplayground.aipoweredrecommendation.service;

import com.cloudnativeplayground.aipoweredrecommendation.model.UserBehavior;
import com.cloudnativeplayground.aipoweredrecommendation.repository.UserBehaviorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;

@Service
public class UserBehaviorService {

    @Autowired
    private UserBehaviorRepository repository;

    public List<UserBehavior> getAllUserBehaviors() {
        return repository.findAll();
    }

    public void saveUserBehavior(UserBehavior userBehavior) {
        repository.save(userBehavior);
    }

    public List<UserBehavior> getUserBehaviors(String userId) {
        return repository.findByUserId(userId);
    }

    private final List<UserBehavior> behaviors = new ArrayList<>();

    public void trackBehavior(UserBehavior behavior) {
        behaviors.add(behavior);
    }

    public List<UserBehavior> getUserBehaviors() {
        return behaviors;
    }
}
