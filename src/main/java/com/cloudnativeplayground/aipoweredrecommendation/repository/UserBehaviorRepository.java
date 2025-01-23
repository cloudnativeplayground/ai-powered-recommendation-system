package com.cloudnativeplayground.aipoweredrecommendation.repository;

import com.cloudnativeplayground.aipoweredrecommendation.model.UserBehavior;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserBehaviorRepository extends JpaRepository<UserBehavior, Long> {
    List<UserBehavior> findByUserId(String userId);
}
