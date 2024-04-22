package org.example;

public class Multiplication2 {
    public static void main(String[] args) {
        welcome();
        multiply(5, 10);
        multiply(56, 78);
        multiply(45567, 675);
        multiply(5643, 567);
        multiply(23344, 6753);
        multiply(8976, 8976);
        multiply(675445, 897655);
        divide(50, 5);
        divide(70, 7);
        divide(24, 4);
        divide(75, 5);
        divide(200, 10);
        divide(500, 5);
        divide(98, 2);
        add(25,33);

    }

    public static void welcome() {
        System.out.println("Welcome to the calculator");

    }


    public static void multiply(int a, int b) {
        System.out.println(a * b);

    }

    public static void divide(int x, int y) {
        System.out.println(x / y);
    }
    public static void add(int a1,int a2){
        System.out.println(a1+a2);
    }


}

