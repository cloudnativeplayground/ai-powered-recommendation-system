#!/bin/bash
echo "Building the AI-powered Recommendation System..."

# Navigate to the project root directory
cd ..

# Run Maven clean and package
mvn clean package

echo "Build completed successfully. The JAR file is located in the target directory."
