package Arrays;

public class Arrays {
    public static void main(String[] args) {
        int sum = 0;
      //  int avg = 0;
        int[] numbers = {5, 10, 15, 20, 25};
       // int[] s = new int[];
        for (int i = 0; i < numbers.length; i++) {

            sum = sum + numbers[i];

        }
        int avg = sum/numbers.length;
        System.out.println("sum: " +sum);
        System.out.println("Avg: " +avg);

    }


}