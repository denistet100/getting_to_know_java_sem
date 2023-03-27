// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
// Ввод:5
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120


package SEM1;
import java.util.Scanner;

public class PZ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int triangNumb = 0;
        int faktorialNumb = 1;
        for (int i = 1; i < num; ++i){
            triangNumb += i;
            faktorialNumb *= i;
        }
        System.out.printf("triangNumb: %d \n", triangNumb);
        System.out.printf("faktorialNumb: %d \n", faktorialNumb);
    }
}
 