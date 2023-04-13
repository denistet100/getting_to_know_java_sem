package SEM2;

// Дана строка (получение через обычный текстовый файл!!!)

// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода в консоль:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.net.SocketTimeoutException;
import java.io.BufferedReader;


public class PZ2 {
    public static void main(String[] args) {

        String file_name = "/file.txt";
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat(file_name); 
        File file = new File(pathFile);
        BufferedReader reader;
        try {
            FileReader f = new FileReader(file);
            reader = new BufferedReader(f);
            String line = reader.readLine();

            while(line != null){
                String[] splitarraystr = line.split(",");
                for (String item : splitarraystr) {
                    String[] keyValueString = item.split(":");  // .replaseAll("\"", "")
                    String key = keyValueString[0].replaceAll("\"", "");
                    String value = keyValueString[1].replaceAll("\"", "");
                    // if (key == "фамилия"){String lastName = value;}
                    // if (key == "предмет") {String academSubject = value;}
                    // if (key ==  "оценка") {String grade = value;}
                    // System.out.println(lastName);
                    // System.out.println(academSubject);
                    // System.out.println(grade);
                    String lastName = "";
                    String academSubject = "";
                    String grade = "";
                    switch (key){
                        case ("фамилия"):
                            lastName =  value;
                            System.out.print("Студент ");
                            System.out.print(lastName);
                            break;
                        case ("оценка"):
                            grade = value;
                            System.out.print(" получил ");
                            System.out.print(grade);
                            break;
                        case ("предмет"):
                            academSubject = value;
                            System.out.print(" по предмету ");
                            System.out.println(academSubject);
                            break;
                    }
                }
                // System.out.printf("Студент %s получил %s по предмету %s", lastName, grade, academSubject); // Почему-то не работает я потратил уйма времени на это!
                // System.out.print("Студент ");
                // System.out.print(lastName);
                // System.out.print(" получил ");
                // System.out.print(grade);
                // System.out.print(" по предмету ");
                // System.out.print(academSubject);
                line = reader.readLine();
            }
            // System.out.println("try");
        }catch (Exception e) {
            System.out.println("catch2");
            System.out.println(e);
        }
    }
}
