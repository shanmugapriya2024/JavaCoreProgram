package Arrays;

public class Arrays2 {
    public static void main(String[] args) {
        int sub = 100;

        int[] numbers = {10,10,20,10,10};
        for(int i=0; i<5; i++)
        {
            System.out.println("numbers[i]::: " +numbers[i]);

            sub = sub-numbers[i];
        }
        System.out.println("sub::: " +sub);


    }
}
