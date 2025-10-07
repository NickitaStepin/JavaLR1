@echo off
REM Настройка переменных окружения для Java
set JAVA_HOME=C:\Users\nikst\.jdks\openjdk-23.0.2
set PATH=%JAVA_HOME%\bin;%PATH%

echo Переменные окружения настроены:
echo JAVA_HOME=%JAVA_HOME%
echo PATH обновлен с %JAVA_HOME%\bin

REM Проверка установки Java
echo.
echo Проверка Java:
java -version
echo.
echo Проверка компилятора:
javac -version
