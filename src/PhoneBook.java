import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
     private Map<String, List<String>> phoneBook;
// Второе задание
    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void add(String surname, String phoneNumber) {
        if (!phoneBook.containsKey(surname)) {
            phoneBook.put(surname, new ArrayList<>());
        }
        phoneBook.get(surname).add(phoneNumber);
    }

    public List<String> get(String surname) {
        return phoneBook.getOrDefault(surname, Collections.emptyList());
    }

    public void printAll() {
        for (Map.Entry<String, List<String>> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

// Для полноты картины и наглядности
    public boolean remove(String surname, String phoneNumber) {
        List<String> numbers = phoneBook.get(surname);
        if (numbers != null && numbers.remove(phoneNumber)) {
            if (numbers.isEmpty()) {
                phoneBook.remove(surname); // Удаляем ключ, если список номеров пуст
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        // Добавляем записи
        phoneBook.add("Ivanov", "123-456-789");
        phoneBook.add("Petrov", "234-567-890");
        phoneBook.add("Ivanov", "987-654-321");
        phoneBook.add("Sidorov", "456-789-012");
        phoneBook.add("Ivanov", "111-222-333");

        // Выводим все записи
        System.out.println("Все записи в телефонном справочнике:");
        phoneBook.printAll();

        // Ищем номера телефонов по фамилиям
        System.out.println("\nНомера телефонов Иванова: " + phoneBook.get("Ivanov"));
        System.out.println("Номера телефонов Петрова: " + phoneBook.get("Petrov"));
        System.out.println("Номера телефонов Сидорова: " + phoneBook.get("Sidorov"));
        System.out.println("Номера телефонов неизвестного: " + phoneBook.get("Unknown"));

        // Удаляем запись и проверяем удаление
        System.out.println("\nУдаление номера '987-654-321' у Иванова: " + phoneBook.remove("Ivanov", "987-654-321"));
        System.out.println("Удаление номера '234-567-890' у Петрова: " + phoneBook.remove("Petrov", "234-567-890"));
        System.out.println("Удаление номера, которого нет, у Сидорова: " + phoneBook.remove("Sidorov", "000-000-000"));

        // Выводим все записи после удаления
        System.out.println("\nЗаписи в телефонном справочнике после удаления:");
        phoneBook.printAll();
    }
}
