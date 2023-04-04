import java.util.*;

public class PZ2 {

// Пусть дан произвольный список целых чисел, удалить из него чётные числа

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        
        for (int i= 0; i < 10; i++) {
            list.add(random.nextInt(0,100));
        }
        System.out.println(list);

        for (int i= 0; i < list.size(); i++) {
            Integer ans = list.get(i) % 2;
            if (ans.equals(0)){
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }
}
