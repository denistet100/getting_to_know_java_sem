// Вывести все простые числа от 1 до 1000

package SEM1;

public class PZ2 {
    public static void main(String[] args) {
        int nums = 1000;
        for (int i = 1 ; i < nums+1; ++i){
            int count = 0;
            for (int j = 2 ; j < nums / 2; ++j){
                if (i % j == 0 && i > j){
                    count=1;
                }
            }
            if (count == 0){
                System.out.printf("%d ", i);
            }
        }
    }
}
