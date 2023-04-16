import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
// NoteBook notebook1 = new NoteBook
// NoteBook notebook2 = new NoteBook
// NoteBook notebook3 = new NoteBook
// NoteBook notebook4 = new NoteBook
// NoteBook notebook5 = new NoteBook

// Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет

// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

// Класс сделать в отдельном файле

// приветствие
// Выбор параметра
// выбор конкретнее
// вывод подходящих

public class store {
    public static void main(String[] args) {
        NoteBook notebook1 = new NoteBook("MSI", "Stealth 17M", 16, 512, "Windows 10", "Black");
        NoteBook notebook2 = new NoteBook("Dell", "Alienware X17", 32, 1024, "Windows 11", "Green");
        NoteBook notebook3 = new NoteBook("Lenovo", "G40", 16, 256, "Windows 7", "White");
        NoteBook notebook4 = new NoteBook("ASUS", "Fan R", 4, 4096, "Windows XP", "Yellow");
        NoteBook notebook5 = new NoteBook("AORUS", "M15", 16, 2048, "Windows 12", "Grey");
        
        HashSet<NoteBook> notebooks = new HashSet<NoteBook>(Arrays.asList(notebook1, notebook2, notebook3, notebook4, notebook5));

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Добрый день. Вы в магазине ноутбуков!");
                
        boolean filter = true;
        while (filter) {
            System.out.println("Введите цифру, соответствующую необходимому критерию фильтрации:\n1 - ОЗУ\n2 - Объем ЖД\n3 - Операционная система\n4 - Цвет\n5 - Вывести всё\n0 - Выйти");
            int keyfilter = sc.nextInt();
            switch (keyfilter) {
                case 1:
                    filterNB(notebooks, sc, keyfilter);
                    break;
                case 2:
                    filterNB(notebooks, sc, keyfilter);
                    break;
                case 3:
                    filterNB(notebooks, sc, keyfilter);
                    break;
                case 4:
                    filterNB(notebooks, sc, keyfilter);
                    break;
                case 5:
                    showCatalog(notebooks);
                    break;
                case 0:
                    System.out.println("End!");
                    filter = false;
                    break;
                default:
                    System.out.println("Введена неправильная операция");
                    break;
            }
        }

    }


    public static void filterNB(HashSet<NoteBook> notebooks, Scanner scanner, int indecator) {
        // int ind = 1;
        // if (indecator!=0){
        //     ind = indecator;
        // }
        // if (ind < 3) {
        //     TreeSet<Integer> setFilter = new TreeSet<>();
        // }
        // if (ind > 2) {
        //     TreeSet<String> setFilter = new TreeSet<>();
        // }


        TreeSet<Integer> setFilterInt = new TreeSet<>();
        TreeSet<String> setFilterStr = new TreeSet<>();
        


        System.out.print("\nВ каталоге представлены ноутбуки");
        switch (indecator) {
            case 1:
                for (NoteBook nb : notebooks) {
                    setFilterInt.add(nb.getRam());
                }
                System.out.println(" с оперативной памятью ");
                for (Integer nb : setFilterInt) {
                    System.out.println(nb + " Гб");
                }
                break;
            case 2:
                for (NoteBook nb : notebooks) {
                    setFilterInt.add(nb.getHardDisk());
                }
                System.out.println(" с объемом жесткого диска: ");
                for (Integer nb : setFilterInt) {
                    System.out.println(nb + " Гб");
                }
                break;
            case 3:
                for (NoteBook nb : notebooks) {
                    setFilterStr.add(nb.getOperSystem());
                }
                System.out.println("с операционными системами: ");
                for (String nb : setFilterStr) {
                    System.out.println(nb);
                }
                break;
            case 4:
                for (NoteBook nb : notebooks) {
                    setFilterStr.add(nb.getColor());
                }
                System.out.println(" ноутбуки следующих цветов: ");
                for (String nb : setFilterStr) {
                    System.out.println(nb);
                }
                break;
        }
        

        System.out.println("Введите интересующее значение: ");
        String filterString = scanner.next();

        while (true){
            // if (indecator<3) {
            //     int filter = Integer.parseInt(filterString);
            // }
            // if (indecator>2) {
            //     String filter = filterString.toUpperCase();
            // }
            int filter = Integer.parseInt(filterString);
            if (setFilterInt.contains(filter) | setFilterStr.contains(filterString))  {
                System.out.println("\nПодходящие модели по вашему запросу: \n");
                for (NoteBook nb : notebooks) {
                    switch (indecator) {
                        case 1:
                            if (nb.getRam()==filter) {
                                System.out.println(nb);
                            }
                            break;
                        case 2:
                            if (nb.getHardDisk()==filter) {
                                System.out.println(nb);
                            }
                            break;
                        case 3:
                            if (nb.getOperSystem().equals(filterString)) {
                                System.out.println(nb);
                            }
                            break;
                        case 4:
                            if (nb.getColor().equals(filterString)) {
                                System.out.println(nb);
                            }
                            break;
                    }
                }
                break;
            }
            System.out.println("Неправильное значение. Попробуйте снова");
        }

    }

    public static void showCatalog(HashSet<NoteBook> notebooks){
        System.out.println("\nКаталог ноутбуков: \n");
        for (NoteBook nb : notebooks) {
            System.out.println(nb);
        }
    }

}
