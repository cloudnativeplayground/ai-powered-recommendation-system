# AI-powered Recommendation System

Welcome to the **AI-powered Recommendation System**! This open-source Java application provides personalized content recommendations using AI. The application is built with Spring Boot and TensorFlow, ensuring a scalable and robust architecture.

## Features
- **Recommendation Engine**: Leverages TensorFlow to generate personalized recommendations based on user behavior.
- **User Behavior Tracking**: Captures and analyzes user activities for improved recommendation accuracy.
- **Scalable Deployment**: Designed for deployment in production environments with scalability in mind.

## Folder Structure
```
ai-powered-recommendation-system/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── cloudnativeplayground/
│   │   │           └── aipoweredrecommendation/
│   │   │               ├── controller/
│   │   │               │   └── RecommendationController.java
│   │   │               ├── model/
│   │   │               │   └── UserBehavior.java
│   │   │               ├── service/
│   │   │               │   ├── RecommendationService.java
│   │   │               │   └── UserBehaviorService.java
│   │   │               ├── utils/
│   │   │               │   └── TensorFlowUtils.java
│   │   │               └── Application.java
│   │   ├── resources/
│   │       ├── application.properties
│   │       └── static/
│   │           └── index.html
│   ├── test/
│   │   ├── java/
│   │       └── com/
│   │           └── cloudnativeplayground/
│   │               └── aipoweredrecommendation/
│   │                   ├── controller/
│   │                   │   └── RecommendationControllerTest.java
│   │                   ├── service/
│   │                   │   └── RecommendationServiceTest.java
│   │                   └── utils/
│   │                       └── TensorFlowUtilsTest.java
├── build/
├── config/
│   └── tensorflow-model/
├── logs/
├── scripts/
│   ├── start-server.bat
│   └── deploy.bat
└── pom.xml
```

## How the Files Work

### Main Application
- **`Application.java`**: The entry point for the Spring Boot application. Initializes the application and its components.

### Controller
- **`RecommendationController.java`**: Exposes RESTful endpoints for managing user requests and serving personalized recommendations.

### Models
- **`UserBehavior.java`**: Represents user activity data for tracking and analysis.

### Services
- **`RecommendationService.java`**: Implements the logic for generating recommendations using the TensorFlow model.
- **`UserBehaviorService.java`**: Manages user behavior data and integrates it with the recommendation engine.

### Utilities
- **`TensorFlowUtils.java`**: Contains helper methods to load, run, and manage TensorFlow models efficiently.

### Resources
- **`application.properties`**: Configuration file for setting application properties, such as database connections and TensorFlow model paths.
- **`index.html`**: A simple static page for demonstrating the application's capabilities.

### Testing
- **`RecommendationControllerTest.java`**: Tests the REST endpoints provided by the `RecommendationController`.
- **`RecommendationServiceTest.java`**: Verifies the functionality of the `RecommendationService`.
- **`TensorFlowUtilsTest.java`**: Ensures the utility methods for TensorFlow integration work as expected.

### Build and Configuration
- **`pom.xml`**: Maven build file specifying dependencies and project configurations.
- **`config/tensorflow-model/`**: Directory to store TensorFlow model files.
- **`logs/`**: Directory to store application logs.

### Scripts
- **`start-server.bat`**: A script to start the application server locally.
- **`deploy.bat`**: A script for deploying the application to a production environment.

## Getting Started

1. **Clone the Repository**:
   ```sh
   git clone https://github.com/cloudnativeplayground/ai-powered-recommendation-system.git
   cd ai-powered-recommendation-system
   ```

2. **Build the Project**:
   ```sh
   mvn clean install
   ```

3. **Run the Application**:
   ```sh
   java -jar target/ai-powered-recommendation-system-1.0.jar
   ```

4. **Access the Application**:
   Open your browser and navigate to `http://localhost:8080`.

## License
This project is licensed under the GNU General Public License v3.0. See the [LICENSE](LICENSE) file for details.

---

Maintained by [Aditya Pratap Bhuyan](https://linkedin.com/in/adityabhuyan). Contributions are welcome! 🚀
```