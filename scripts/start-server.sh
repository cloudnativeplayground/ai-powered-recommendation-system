#!/bin/bash
echo "Starting the AI-powered Recommendation System..."

# Set the Java Home path (if required)
export JAVA_HOME=/path/to/java/jdk-XX
export PATH=$JAVA_HOME/bin:$PATH

# Navigate to the project root directory
cd ..

# Build and run the application
mvn clean install
java -jar target/aipoweredrecommendation-1.0.0.jar

echo "Application started successfully."
