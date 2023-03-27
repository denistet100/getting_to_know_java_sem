// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->

package SEM1;
import java.util.Scanner;

public class PZ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите выражение: A _ B = ?");
        System.out.print("Введите первый член A :");
        int num1 = sc.nextInt();
        System.out.print("Введите знак _ :");
        String signStr = sc.next();
        char sign = signStr.charAt(0);
        System.out.print("Введите второй член B :");
        int num2 = sc.nextInt();
        int answer = 0;
        if (sign == '+') answer = num1 + num2;
        if (sign == '*') answer = num1 * num2;
        if (sign == '-') answer = num1 - num2;
        if (sign == '/') answer = num1 / num2;
        System.out.printf("%d %s %d = %d \n", num1, sign, num2, answer);
        // switch (signStr){
        //     case "+":
        //         answer = num1 + num2;
        //         break
        //     case "*": 
        //         answer = num1 * num2;
        //         break
        //     case "-":
        //         answer = num1 - num2;
        //         break
        //     case "/":
        //         answer = num1 / num2;
        //         break
        // }
        // System.out.printf("%d %s %d = %d \n", num1, signStr, num2, answer);
    }
}
