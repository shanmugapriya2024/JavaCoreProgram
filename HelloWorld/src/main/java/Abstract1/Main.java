package Abstract1;

public class Main {
        public static void main(String[] args) {
            Finance f= new ChaseBank();
            System.out.println("The Housing Rate of Interest :  " + f.housingRateOfInterest());
            Finance f1 = new PncBank();
            System.out.println("The Housing Rate of Interest :  " + f1.housingRateOfInterest());
        }
    }

