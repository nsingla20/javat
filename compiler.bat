@echo off
if not exist "javat" goto a
if exist "class_files" rd /s /q "class_files"
md class_files
javac -d "class_files" javat\Run.java
cd class_files
jar -c --file=javat.jar --main-class=javat.Run javat/
jar -t --file=javat.jar
cd..
pause
:a
cd class_files
cls

echo TYPE COMMAND-LINE ARGUMENT IF ANY
SET/P COMMAND=
cls
JAVA -jar javat.jar %COMMAND%
echo.
echo BYE!
echo.
pause