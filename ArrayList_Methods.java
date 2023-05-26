package arraylist_methods;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Methods{
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <Integer> list1 = new ArrayList(Arrays.asList(10, 10, 10, 10, 30));
        System.out.println(list1.get(1));   // 10
        
        list1.set(3, 20);
        System.out.println(list1.get(3));   // 20
        
        list1.remove(2);
        System.out.println(list1);  // [10, 10, 20, 30]
        
        list1.remove((Integer)10);    // (Integer)10 ^or^ new Integer(10) ^or^ Integer.valueOf(10)
        System.out.println(list1);  // [10, 20, 30]
        
        System.out.println(list1.contains(10)); // true
        
        /*-----------------------------------------------------------------------------------------------*/
        ArrayList <Character> list2 = new ArrayList(Arrays.asList('A', 'C', 'B', 'A', 'C'));
        list2.removeAll(Arrays.asList('A'));
        System.out.println(list2);  // [C, B, C]
        
        /*-----------------------------------------------------------------------------------------------*/
        ArrayList <Integer> list3 = new ArrayList(Arrays.asList(0, 1, 2, 3, 4, 5, 6));
        list3.removeIf(n -> n % 2 == 1);
        System.out.println(list3);  // [0, 2, 4, 6]
        list3.forEach(n -> System.out.print(n + " - "));    // 0 - 2 - 4 - 6 -
       
        /*-----------------------------------------------------------------------------------------------*/
        ArrayList list4 = new ArrayList(Arrays.asList("A", 'N', true, 21, 9.0));
        System.out.println(list4);  // [A, N, true, 21, 9.0]
        
        /*-----------------------------------------------------------------------------------------------*/
        ArrayList <Integer> list5 = new ArrayList(Arrays.asList(1, 1, 2, 3, 3, 5, 6));
        list5.retainAll(Arrays.asList(1, 5));
        System.out.println(list5);  // [1, 1, 5]
        System.out.println(list5.subList(0, 2));    // [1, 1]
        list5.clear();
        System.out.println(list5.isEmpty());    // true
        
        /*-----------------------------------------------------------------------------------------------*/
        ArrayList <Integer> list6 = new ArrayList(Arrays.asList(1, 2, 8, 5, 6, 4, 7));
        Collections.reverse(list6);
        System.out.println(list6);  // [7, 4, 6, 5, 8, 2, 1]
        Collections.sort(list6);
        System.out.println(list6);  // [1, 2, 4, 5, 6, 7, 8]
        Collections.sort(list6, Collections.reverseOrder());
        System.out.println(list6);  // [8, 7, 6, 5, 4, 2, 1]
        System.out.println(Collections.min(list6)); // 1
        System.out.println(Collections.max(list6)); // 8
        
    }
}
