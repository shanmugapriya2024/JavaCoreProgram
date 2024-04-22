package org.example.basic;

public class Multiplication {

    public int testMethod(){
        int num = 0;

        try {
            int numOfGirl = 100;
            int numOfBoys = 100;
            int total = numOfGirl * numOfBoys;
            System.out.println("Total:  " + total);
           // System.out.println("Before exception throws");
            num = 100/0;
           // System.out.println("After exception throws************");


        }
        catch (ArithmeticException e){
        System.out.println("Throw "+e);
        }


        finally{
            System.out.println("Hello");
        }
        return num;

    }
    public static void main(String[] args) {

        Multiplication m = new Multiplication();
        m.testMethod();
        System.out.println("Test Method execution continue");


    }
}