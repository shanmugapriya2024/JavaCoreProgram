package Arrays;

public class Arrays3 {
    public static void main(String[] args) {
        int multiply = 5;

        int[] numbers = {1,2,3,4,5};
        for (int i = 0; i<numbers.length; i++){

            System.out.println("numbers[i]::: " +numbers[i]);

            multiply = multiply*numbers[i];
            System.out.println("Multiply ::::  " +multiply);

        }
    }
}
