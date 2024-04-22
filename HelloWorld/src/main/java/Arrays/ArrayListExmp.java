package Arrays;

import java.util.ArrayList;

public class ArrayListExmp {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);
        System.out.println("Arraylist :" + list);
        int sum =0;
        int avg =0;

        for( int i = 0; i<list.size();i++){
            sum = sum + list.get(i);
            avg = sum/5;
        }


        System.out.println("The sum : " +sum);
        System.out.println("The avg :" + avg);

    }
}
