package SEM4;
// 3) В калькулятор добавьте возможность отменить последнюю операцию.
// Пример

// 1
// +
// 2
// ответ:
// 3

// +
// 4
// ответ:
// 7
// +
// 2

// ответ:

// 9
// 1
// Ответ 8
// Отмена -> 9
// Отмена -> 7
// Отмена -> 3
// +
// 2
// Ответ 5
import java.io.IOException;
import java.util.logging.*;
import java.util.Scanner;
import java.util.Stack;
public class PZ3 {
    public static void main(String[] args) throws IOException{

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите выражение: A _ B = ?");
        System.out.print("Введите первый член A :");
        int num1 = sc.nextInt();

    //     sc.close();
    //     int ans = calcul(num1);
    // }    // Не получилось реализовать через функцию...
    // static int calcul(int num1) throws IOException{
    //     Scanner sc = new Scanner(System.in);

        Logger logger = Logger.getLogger(PZ3.class.getName());
        FileHandler fh = new FileHandler("/logpz3.xml", true);
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        while(true){
            System.out.print("Введите знак _ :");
            String signStr = sc.next();

            if (signStr.equals("stop")){
                break;
            }else{
                if (signStr.equals("cancel")){
                    num1 = stack.pop();
                    System.out.println(num1);
                }else{
                    System.out.print("Введите второй член B :");
                    String num2Str = sc.next();
                    System.out.print("Ответ: ");
                    char sign = signStr.charAt(0);
                    int num2 = Integer.parseInt(num2Str);
                    stack.add(num1);
                    switch (sign){
                        case ('+'):
                            answer = num1 + num2;
                            break;
                        case ('*'):
                            answer = num1 * num2;
                            break;
                        case ('-'):
                            answer = num1 - num2;
                            break;
                        case ('/'):
                            answer = num1 / num2;
                            break;
                    }
                    String ansStr = String.format("%d %s %d = %d", num1, sign, num2, answer);
                    System.out.println(ansStr);
                    logger.addHandler(fh);
                    XMLFormatter xml = new XMLFormatter();
                    fh.setFormatter(xml);
                    logger.info(ansStr);
                    num1 = answer;
                }
            }
        } 
        sc.close();
        // return answer;
    }
}
