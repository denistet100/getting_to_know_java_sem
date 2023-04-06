package SEM4;
// 1) Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.
import java.util.*;
public class PZ1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);
        list =  functionTurnOver(list);
        System.out.println(list);
    }

    static LinkedList<Integer> functionTurnOver(LinkedList<Integer> list) {
        LinkedList<Integer> newlist = new LinkedList<>();

        for (int i = list.size()-1; i > -1; i--) {newlist.add(list.get(i));}
        return newlist;
    }
}
