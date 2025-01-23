CREATE TABLE user_behavior (
    id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT NOT NULL,
    page_viewed VARCHAR(255) NOT NULL,
    time_spent_seconds INT NOT NULL,
    timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE recommendations (
    id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT NOT NULL,
    recommendation TEXT NOT NULL,
    timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


-- Preload user_behavior data
INSERT INTO user_behavior (user_id, page_viewed, time_spent_seconds)
VALUES
(1, 'Homepage', 120),
(1, 'Product Page', 300),
(2, 'Homepage', 100),
(2, 'Checkout Page', 50),
(3, 'Product Page', 200),
(3, 'Blog Page', 400);

-- Preload recommendations data
INSERT INTO recommendations (user_id, recommendation)
VALUES
(1, 'Recommended: Product A, Product B'),
(2, 'Recommended: Product C, Product D'),
(3, 'Recommended: Product E, Product F');
