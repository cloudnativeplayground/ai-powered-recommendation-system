@echo off
echo Starting the AI-powered Recommendation System...

:: Set the Java Home path (if not already set)
set JAVA_HOME=C:\Path\To\Java\jdk-XX

:: Navigate to the project folder
cd ..

:: Build and run the application
mvn clean install
java -jar target\aipoweredrecommendation-1.0.0.jar

echo Application started successfully.
pause
