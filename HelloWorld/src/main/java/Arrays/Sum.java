package Arrays;

public class Sum {

    public static int sum(int numbers){

        int sum = 0;

        while (numbers != 0){
            sum = sum + numbers%10;
           numbers = numbers /10;
        }
    return sum;
    }

    public static void main(String[] args) {

        int num = 12345;
        System.out.println("test:" +sum(num));


    }
}
