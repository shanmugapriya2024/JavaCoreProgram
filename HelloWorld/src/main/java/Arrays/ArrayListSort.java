package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList();
        list.add(5);
        list.add(15);
        list.add(10);
        list.add(20);
        list.add(7);
        list.add(25);
        //Before sort list
        System.out.println("Arraylist :" + list);

        Collections.sort(list);
        System.out.println("ArrayList Sorting ASC Order: " +list);

    }
}
