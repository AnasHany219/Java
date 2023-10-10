package arraylist;

import java.util.Arrays;
import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList list1 = new ArrayList();
        list1.add(20);
        list1.add(30);
        System.out.println(list1);  // [20, 30]
        
        ArrayList list2 = new ArrayList();
        list2.add(10);
        list2.add(list1);
        System.out.println(list2);  // [10, [20, 30]]
        
        ArrayList list3 = new ArrayList();
        list3.add(list2);
        list3.addAll(1, Arrays.asList(40, 50));
        System.out.println(list3);  // [[10, [20, 30]], 40, 50]
        
        ArrayList list4 = new ArrayList();
        // list4 = list3; -> as a referance
        list4 = (ArrayList)list3.clone();
        list4.add(60);
        System.out.println(list4);  // [[10, [20, 30]], 40, 50, 60]
    }
}
