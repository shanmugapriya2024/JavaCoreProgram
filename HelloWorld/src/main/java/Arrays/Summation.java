package Arrays;

import java.util.ArrayList;

public class Summation {
    public static void main(String[] args) {
        int sum =0;
        int  numbers = 1;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

      /*  for (int i=0; i<list.size();i++){
                sum = sum + list.get(i);
        }
        System.out.println("Summation:" +sum);
*/
        while(numbers <=10 ){
            sum = sum + numbers ;
            numbers ++;
        }
        System.out.println("Summation:" +sum);
    }
}