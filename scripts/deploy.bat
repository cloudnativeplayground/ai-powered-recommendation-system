@echo off
echo Deploying the AI-powered Recommendation System...

:: Define variables for remote server details
set REMOTE_HOST=your.remote.server.com
set REMOTE_USER=yourusername
set REMOTE_DIR=/path/to/deploy
set JAR_FILE=target\aipoweredrecommendation-1.0.0.jar

:: Build the application
cd ..
mvn clean package

:: Copy the jar file to the remote server
scp %JAR_FILE% %REMOTE_USER%@%REMOTE_HOST%:%REMOTE_DIR%

:: Restart the remote service (modify as per your environment)
ssh %REMOTE_USER%@%REMOTE_HOST% "cd %REMOTE_DIR% && nohup java -jar aipoweredrecommendation-1.0.0.jar > app.log 2>&1 &"

echo Deployment completed successfully.
pause
