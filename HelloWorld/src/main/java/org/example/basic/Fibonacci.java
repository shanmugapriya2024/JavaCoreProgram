package org.example.basic;

public class Fibonacci {
    public static void main(String[] args) {
        //Fibonacci
        //0 1 1 2 3 5 8

        int n =10;
        int a = 0;
        int b = 1;
        for (int i = 0; i <= n; i++) {
            System.out.println(a + " ");
            int c = a+b;
            a = b;
            b = c;


        }
    }
}