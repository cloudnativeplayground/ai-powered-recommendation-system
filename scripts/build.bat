@echo off
echo Building the AI-powered Recommendation System...

:: Navigate to the root directory
cd ..

:: Run Maven clean and package
mvn clean package

echo Build completed successfully. The jar file is located in the target directory.
pause
