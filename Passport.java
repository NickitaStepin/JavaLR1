/**
 * Простой проект Passport
 * Выводит ФИО, группу и краткую информацию о себе
 */
public class Passport {
    public static void main(String[] args) {
        // Вывод ФИО
        System.out.println("=== ПАСПОРТ СТУДЕНТА ===");
        System.out.println("ФИО: Иванов Иван Иванович");
        System.out.println("Группа: ИТ-21-1");
        System.out.println();
        
        // Краткая информация о себе
        System.out.println("=== КРАТКАЯ ИНФОРМАЦИЯ ===");
        System.out.println("Специальность: Информационные технологии");
        System.out.println("Курс: 2");
        System.out.println("Университет: Технический университет");
        System.out.println("Хобби: Программирование, чтение книг");
        System.out.println("Цель: Стать профессиональным разработчиком");
        System.out.println();
        
        System.out.println("Проект успешно скомпилирован и запущен!");
        System.out.println("Дата создания: " + java.time.LocalDate.now());
    }
}
