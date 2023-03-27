// *(ДОПОЛНИТЕЛЬНАЯ) +Задано уравнение вида q + w = e, q, w, e >= 0.
// Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69 (пользователь).
// Требуется восстановить выражение до верного равенства.
// Предложить хотя бы одно решение или сообщить, что его нет.
// под знаками вопроса - одинаковые цифра
// Ввод: 2? + ?5 = 69
// Вывод: 24 + 45 = 69

package SEM1;
import java.util.Scanner;

public class PZ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите выражение: q + w = e, q, w, e >= 0");
        System.out.println("Вид выражения: 2? + ?5 = 69");
        System.out.print("Введите первый член q с ?:");        
        String num1Str = sc.nextLine();
        System.out.print("Введите второй член w с ?:");
        String num2Str = sc.nextLine();
        System.out.print("Введите ответ полность e :");
        int answer = sc.nextInt();
        String[] resultArr = new String[10];
        int count = 0;
        for (int i = 0; i < 10; ++i){
            String[] splitarraynum1 = num1Str.split("");
            String[] splitarraynum2 = num2Str.split("");
            String newNum1Srt = "";
            String newNum2Srt = "";
            for (String a : splitarraynum1){
                if (a.equals("?")){
                    newNum1Srt = newNum1Srt + i;
                }else{
                    newNum1Srt = newNum1Srt + a;
                }
            }
            int newNum1Int = Integer.parseInt(newNum1Srt);
            for (String a : splitarraynum2){
                if (a.equals("?")){
                    newNum2Srt = newNum2Srt + i;
                }else{
                    newNum2Srt = newNum2Srt + a;
                }
            }
            int newNum2Int = Integer.parseInt(newNum2Srt);
            int sumAnswer = newNum1Int + newNum2Int;
            if(sumAnswer == answer){
                String ansres = String.format("%d + %d = %d", newNum1Int, newNum2Int, answer);
                resultArr[count] = ansres;
                count++;
            }
        }
        if (count > 0){
            for (String item : resultArr){
                if (item != null)
                System.out.println(item);
            }
        }else{
            System.out.print("Решения нет");
        }
        
    }
    
}
