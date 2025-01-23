@echo off
echo Stopping the AI-powered Recommendation System...

:: Find and kill the process (for Windows)
for /f "tokens=5" %%a in ('netstat -ano ^| find "8080"') do taskkill /pid %%a /f

echo Application stopped successfully.
pause
