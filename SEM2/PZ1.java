package SEM2;

// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
// результат после каждой итерации запишите в лог-файл.

import java.io.IOException;
import java.util.logging.*;

public class PZ1 {
    public static void main(String[] args) throws IOException{
        int[] list1 = new int[] {1, 3, 3, 2, 4, 2, 6, 5, 7, 0, 6};
        list1 = functionsort(list1);
        for (int i : list1) {
            System.out.print(i);
            System.out.print(" ");
        }
    }

    static int[] functionsort(int[] arrayNumb) throws IOException{
        Logger logger = Logger.getLogger(PZ1.class.getName());
        FileHandler fh = new FileHandler("log.xml");
        for (int i = 0; i < arrayNumb.length; i++) {
            for (int j = 0; j < arrayNumb.length; j++) {
                logger.addHandler(fh);
                XMLFormatter xml = new XMLFormatter();
                fh.setFormatter(xml);
                logger.info("Прогон");
                if (arrayNumb[i] < arrayNumb[j]){             // не понимаю почему в обратную сторону?
                    int buf = arrayNumb[j];
                    arrayNumb[j] = arrayNumb[i];
                    arrayNumb[i] = buf;
                }
            }
        }
        return arrayNumb;
    }
}
