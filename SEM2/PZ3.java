package SEM2;

// дополнительно. К калькулятору из предыдущего дз добавить логирование.
// 1 + 3 = 4
// 4 + 3 = 7

import java.io.IOException;
import java.util.logging.*;
import java.util.Scanner;

public class PZ3 {
    public static void main(String[] args) throws IOException{
        Logger logger = Logger.getLogger(PZ1.class.getName());
        FileHandler fh = new FileHandler("logpz3.xml");
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
        String ansStr = String.format("%d %s %d = %d", num1, sign, num2, answer);
        System.out.println(ansStr);
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        logger.info(ansStr);
    }
}
