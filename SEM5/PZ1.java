import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
// import java.util.*;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
// Добавить функции 1) Добавление номера
// 2) Вывод всего
// Пример:
// Я ввожу: 1
// К: Введите фамилию
// Я: Иванов
// К: Введите номер
// Я: 1242353
// К: Введите 1) Добавление номера
// 2) Вывод всего
// Я ввожу: 1
// К: Введите фамилию
// Я: Иванов
// К: Введите номер
// Я: 547568
// К: Введите 1) Добавление номера
// 2) Вывод всего
// Я: 2
// Иванов: 1242353, 547568


public class PZ1  {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        boolean whbool = true;
        while (whbool) {
            System.out.println("Введите: \n1) Добавление номера\n2) Вывод всего\n3) Stop");
            int key = sc.nextInt();
            switch (key){
                case (1):
                    System.out.println("Введите фамилию");
                    String lastname = sc.next();
                    System.out.println("Введите номер");
                    Integer phoneuser = sc.nextInt();
                    addNumber(lastname, phoneuser, phoneBook);
                    break;
                case (2):
                    printPBook(phoneBook);
                    break;
                case (3):
                    whbool =false;
                    break;
        }
        }
    }


    static void addNumber(String key, Integer value, HashMap<String, ArrayList<Integer>> phoneBook){
        if (phoneBook.containsKey(key)) {
            phoneBook.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            phoneBook.put(key, list);
        }
    }


    static void printPBook(HashMap<String, ArrayList<Integer>> phoneBook){
        Integer len = phoneBook.size();
        if (len.equals(0)){
            System.out.println("Телефонная книга пуста");
        } else {
            for (var item : phoneBook.entrySet()) {
                String phones = "";
                for(Integer el: item.getValue()){
                    phones = phones + el + ", ";
                }
                System.out.printf("%s: %s\n", item.getKey(), (phones.substring(0, phones.length() - 2)));
            }
        }
    }

}