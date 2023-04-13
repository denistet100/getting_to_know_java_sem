import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

// Пусть дан список сотрудников:
// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности Имени.



public class PZ2 {
    public static void main(String[] args) {
        String[] listEmploees = new String[] { "Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина", "Анна Крутова", 
        "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова", "Мария Федорова", "Марина Светлова", "Мария Савина", "Мария Рыкова",
        "Марина Лугова", "Анна Владимирова", "Иван Мечников", "Иван Ежов"};
        System.out.println(getMap(getName(listEmploees)));
        System.out.println(getSortName(getMap(getName(listEmploees))));
    }        

    static ArrayList<String> getName(String [] list){
        ArrayList<String> listName = new ArrayList<>();
        for (String el : list) {
            String [] elList = el.split(" ");
            listName.add(elList[0]);
        }
        return listName;
    }

    static HashMap<String, Integer> getMap(ArrayList<String> list){
        HashMap<String, Integer> nameMap = new HashMap<>();
        Integer count = 1;
        for (String key : list) {
            if (nameMap.containsKey(key)) {
                count = nameMap.get(key);
                count += 1;
            } 
            nameMap.put(key, count);
        }
        return nameMap;
    }

    static ArrayList<String> getSortName(HashMap<String, Integer> map){
        Map<Integer, ArrayList<String>> countnameMap = new LinkedHashMap<>();
        ArrayList<String> sortlistName = new ArrayList<>();
        int maxcount = 0;
        for (var item : map.entrySet()) {
            Integer key = item.getValue();
            if (key > maxcount){maxcount = key;}
            if (countnameMap.containsKey(key)) {
                countnameMap.get(key).add(item.getKey());
            } else {
                ArrayList<String> list = new ArrayList<>();
                list.add(item.getKey());
                countnameMap.put(key, list);
            }
        }
        for (int i = maxcount; i > 0; i--) {
            if (countnameMap.containsKey(i) ) {
                for (String item : countnameMap.get(i)) {
                    sortlistName.add(item);
                }
            }
            
        }
        return sortlistName;
    }

}
