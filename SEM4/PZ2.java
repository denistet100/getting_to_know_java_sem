package SEM4;
// 2) Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

import java.util.*;

public class PZ2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        enqueue(list, 6);
        System.out.println(list);
        System.out.println(dequeue(list));
        System.out.println(list);
        System.out.println(first(list));
        System.out.println(list);

    }
    static LinkedList<Integer> enqueue(LinkedList<Integer> list, int item) {
        list.add(item);
        return list;
    }
    static Integer dequeue(LinkedList<Integer> list) {
        int first = list.getFirst();
        list.removeFirst();
        return first;
    }
    static Integer first(LinkedList<Integer> list) {
        return list.getFirst();
    }
}
