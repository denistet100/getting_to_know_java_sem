import java.util.*;
public class PZ1 {
    
    // (Дополнительное) Реализовать алгоритм сортировки слиянием
    
        public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>();
            Random random = new Random();
            
            for (int i= 0; i < 10; i++) {
                list.add(random.nextInt(0,100));
            }
            System.out.println(list);   
            list = sortByMerging(list);    
            System.out.println(list);      
        }

        static ArrayList<Integer> sortByMerging(ArrayList<Integer> list){
            Integer sizeList = list.size();
            if (sizeList.equals(1) || sizeList.equals(0)){
                return list;
            }
            ArrayList<Integer> list1 = new ArrayList<>(list.subList(0, list.size()/2));
            ArrayList<Integer> list2 = new ArrayList<>(list.subList(list.size()/2, list.size()));
            // System.out.println("list1");
            // System.out.println(list1);
            // System.out.println("list2");
            // System.out.println(list2);
            ArrayList<Integer> listSortleft = sortByMerging(list1);
            ArrayList<Integer> listSortRight = sortByMerging(list2);
            // System.out.println("listSortleft");
            // System.out.println(listSortleft); 
            // System.out.println("listSortRight"); 
            // System.out.println(listSortRight); 
            int n = 0;
            int m = 0;
            int k = 0;
            ArrayList<Integer> C = new ArrayList<>();
            // System.out.println("C"); 
            // System.out.println(C); 
            while (n < listSortleft.size() && m < listSortRight.size()){
                if (listSortleft.get(n) <= listSortRight.get(m)) {
                    C.add(k, listSortleft.get(n));
                    // System.out.println("C"); 
                    // System.out.println(C); 
                    n++;
                }else{
                    C.add(listSortRight.get(n));
                    // System.out.println("C"); 
                    // System.out.println(C); 
                    m++;
                }
                k++;
            }
            while (n < listSortleft.size()){
                C.add(k, listSortleft.get(n));
                // System.out.println("C"); 
                // System.out.println(C); 
                n++;
                k++;
            }
            while (m < listSortRight.size()){
                C.add(k, listSortRight.get(m));
                // System.out.println("C"); 
                // System.out.println(C); 
                m++;
                k++;
            }
            return C;
        }
    }
    