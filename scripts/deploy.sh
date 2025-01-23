#!/bin/bash
echo "Deploying the AI-powered Recommendation System..."

# Define variables for remote server details
REMOTE_HOST="your.remote.server.com"
REMOTE_USER="yourusername"
REMOTE_DIR="/path/to/deploy"
JAR_FILE="target/aipoweredrecommendation-1.0.0.jar"

# Build the application
cd ..
mvn clean package

# Copy the JAR file to the remote server
scp $JAR_FILE $REMOTE_USER@$REMOTE_HOST:$REMOTE_DIR

# Restart the application on the remote server
ssh $REMOTE_USER@$REMOTE_HOST "cd $REMOTE_DIR && nohup java -jar aipoweredrecommendation-1.0.0.jar > app.log 2>&1 &"

echo "Deployment completed successfully."
