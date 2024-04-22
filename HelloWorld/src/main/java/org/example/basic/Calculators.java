package org.example.basic;

import java.sql.SQLOutput;
import java.util.concurrent.Callable;

public class Calculators {

    public static void main(String[] args) {
        Calculators c = new Calculators();
        c.add();

    }

    private void add() {
        int x = 5,y = 3;
        int z = x + y;
        System.out.println("The value of z :"   + z);
        System.out.println(5+3);
        System.out.println("System" +   5  +  "   " +    3);
        System.out.println("System : " + (5+3));
        System.out.println('a' + 'b');
        System.out.println();






    }
}

