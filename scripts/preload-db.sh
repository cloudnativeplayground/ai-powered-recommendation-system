#!/bin/bash

echo "Preloading the database with initial data..."

mysql -u root -p -e "
USE your_database_name;

INSERT INTO user_behavior (user_id, page_viewed, time_spent_seconds)
VALUES
(1, 'Homepage', 120),
(1, 'Product Page', 300),
(2, 'Homepage', 100),
(2, 'Checkout Page', 50),
(3, 'Product Page', 200),
(3, 'Blog Page', 400);

INSERT INTO recommendations (user_id, recommendation)
VALUES
(1, 'Recommended: Product A, Product B'),
(2, 'Recommended: Product C, Product D'),
(3, 'Recommended: Product E, Product F');
"

echo "Database preloaded successfully."
