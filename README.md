# Passport Project

Простой Java проект, который выводит информацию о студенте.

## Описание

Проект `Passport` выводит в консоль:
- ФИО студента
- Группу
- Краткую информацию о себе
- Текущую дату

## Требования

- Java 8 или выше
- JDK для компиляции

## Установка и запуск

### Настройка переменных окружения

Для Windows используйте файл `environment_setup.bat`:
```batch
environment_setup.bat
```

Или настройте вручную:
```batch
set JAVA_HOME=C:\path\to\your\jdk
set PATH=%JAVA_HOME%\bin;%PATH%
```

### Компиляция и запуск

```bash
# Компиляция
javac Passport.java

# Запуск
java Passport
```

## Структура проекта

```
lrjava/
├── Passport.java          # Основной файл программы
├── environment_setup.bat  # Скрипт настройки окружения
├── setup_log.txt         # Лог команд Git
├── .gitignore            # Исключения для Git
└── README.md             # Этот файл
```

## Автор

Студент группы ИТ-21-1
