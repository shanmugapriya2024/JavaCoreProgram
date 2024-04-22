package org.example;

public class Main {



    public static void main(String[] args) {
     Calculator c = new Calculator();

        int sum = c.add( 3,4);
        int sub = c.sub(7,4);
       // System.out.println("The sum is :" + sum);
       // System.out.println(" The sub is :" + sub );

        AdvancedCalculator a = new AdvancedCalculator();
        double div = a.division(70,4);
        int multiply = a.multiply( 5,5);
        System.out.println(" The division is :  " + div);
        System.out.println(" The multiply is : " + multiply);

        VeryAdvancedCalculator v = new VeryAdvancedCalculator();
        int s = v.square( 5);
        int n =  v.add( 2,3);
        int g =  v.sub(7,4);
        int l = v.multiply(6,6);
        double  q =v.division(24,4);
        System.out.println( s + "  " + n + "  " + g + " " + l + " " + q );

        AdvancedCalculator advObj = new AdvancedCalculator();
        VeryAdvancedCalculator vAdObj = new VeryAdvancedCalculator();
        System.out.println("Method Override for Advance Calculator : "+ advObj.multiply(3,2));
        System.out.println("Method Override for VeryAdvance Calculator : " +vAdObj.multiply(3,2));

        System.out.println(a.division( 60,6));










    }
}
