#!/bin/bash
echo "Stopping the AI-powered Recommendation System..."

# Find and kill the process running on port 8080
PID=$(lsof -t -i:8080)
if [ -n "$PID" ]; then
  kill -9 $PID
  echo "Application stopped successfully."
else
  echo "No application running on port 8080."
fi
