package com.cloudnativeplayground.aipoweredrecommendation;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Component
public class DataLoader implements CommandLineRunner {

    private final EntityManager entityManager;

    public DataLoader(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        entityManager.createNativeQuery("INSERT INTO user_behavior (user_id, page_viewed, time_spent_seconds) VALUES (1, 'Homepage', 120)").executeUpdate();
        entityManager.createNativeQuery("INSERT INTO user_behavior (user_id, page_viewed, time_spent_seconds) VALUES (1, 'Product Page', 300)").executeUpdate();
        entityManager.createNativeQuery("INSERT INTO user_behavior (user_id, page_viewed, time_spent_seconds) VALUES (2, 'Homepage', 100)").executeUpdate();
        entityManager.createNativeQuery("INSERT INTO user_behavior (user_id, page_viewed, time_spent_seconds) VALUES (2, 'Checkout Page', 50)").executeUpdate();
        entityManager.createNativeQuery("INSERT INTO user_behavior (user_id, page_viewed, time_spent_seconds) VALUES (3, 'Product Page', 200)").executeUpdate();
        entityManager.createNativeQuery("INSERT INTO user_behavior (user_id, page_viewed, time_spent_seconds) VALUES (3, 'Blog Page', 400)").executeUpdate();

        entityManager.createNativeQuery("INSERT INTO recommendations (user_id, recommendation) VALUES (1, 'Recommended: Product A, Product B')").executeUpdate();
        entityManager.createNativeQuery("INSERT INTO recommendations (user_id, recommendation) VALUES (2, 'Recommended: Product C, Product D')").executeUpdate();
        entityManager.createNativeQuery("INSERT INTO recommendations (user_id, recommendation) VALUES (3, 'Recommended: Product E, Product F')").executeUpdate();
    }
}