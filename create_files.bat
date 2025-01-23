@echo off

:: Create folders
mkdir src\main\java\com\cloudnativeplayground\aipoweredrecommendation\controller
mkdir src\main\java\com\cloudnativeplayground\aipoweredrecommendation\model
mkdir src\main\java\com\cloudnativeplayground\aipoweredrecommendation\service
mkdir src\main\java\com\cloudnativeplayground\aipoweredrecommendation\utils
mkdir src\main\resources\static
mkdir src\test\java\com\cloudnativeplayground\aipoweredrecommendation\controller
mkdir src\test\java\com\cloudnativeplayground\aipoweredrecommendation\service
mkdir src\test\java\com\cloudnativeplayground\aipoweredrecommendation\utils
mkdir build\libs
mkdir build\classes
mkdir config\tensorflow-model
mkdir logs
mkdir scripts

:: Create files
type nul > src\main\java\com\cloudnativeplayground\aipoweredrecommendation\Application.java
type nul > src\main\java\com\cloudnativeplayground\aipoweredrecommendation\controller\RecommendationController.java
type nul > src\main\java\com\cloudnativeplayground\aipoweredrecommendation\model\UserBehavior.java
type nul > src\main\java\com\cloudnativeplayground\aipoweredrecommendation\service\RecommendationService.java
type nul > src\main\java\com\cloudnativeplayground\aipoweredrecommendation\service\UserBehaviorService.java
type nul > src\main\java\com\cloudnativeplayground\aipoweredrecommendation\utils\TensorFlowUtils.java
type nul > src\main\resources\application.properties
type nul > src\main\resources\static\index.html
type nul > src\test\java\com\cloudnativeplayground\aipoweredrecommendation\controller\RecommendationControllerTest.java
type nul > src\test\java\com\cloudnativeplayground\aipoweredrecommendation\service\RecommendationServiceTest.java
type nul > src\test\java\com\cloudnativeplayground\aipoweredrecommendation\utils\TensorFlowUtilsTest.java
type nul > pom.xml
type nul > scripts\start-server.bat
type nul > scripts\deploy.bat

echo Folder structure and files created successfully.
