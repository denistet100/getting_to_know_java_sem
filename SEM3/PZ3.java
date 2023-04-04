import java.util.*;
public class PZ3 {
    
// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        
        for (int i= 0; i < 10; i++) {
            list.add(random.nextInt(0,100));
        }
        System.out.println(list);

        Integer maxList = 0;
        Integer minList = 101;
        Integer sum = 0;
        for (Integer item : list) {
            if (item > maxList){
                maxList = item;
            }
            if (item < minList){
                minList = item;
            }
            sum += item;
        }
        Integer arithmeticMean = sum / list.size();
        System.out.println(maxList);
        System.out.println(minList);
        System.out.println(arithmeticMean);
    }
}
