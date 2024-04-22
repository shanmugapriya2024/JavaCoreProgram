package org.example.basic;

public class Firstpro {

    //

public void add(int a, int b) {


    int sum = a + b;
    System.out.println("The First Number is " + a);
    System.out.println("The Second Number " + b + " and sum :" + sum);
}
public void sub1(){
    int d1 = 3;
    int d2 = 2;
    int d3 = d1 - d2;
    System.out.println("The First Number is " + d1);
    System.out.println("The Second Number " + d2 + " and subtract : " + d3);

}
public void mul1(){
    int a1 = 5;
    int a2 = 5;
    int a3 = a1*a2;
    System.out.println("The First /number is " + a1);
    System.out.println("The second number "  +  a2 +  "and multiply : "+  a3);
}

public void div1(){
    int b1 = 100;
    int b2 = 5;
    int b3 = b1/b2;
    System.out.println("The First Number is " +  b1);
    System.out.println("The Second Number " + b2 + "and divide : " + b3);
}
public void boo1(){
boolean swim = true;
        int q1 = 25;
        System.out.println(q1>=25);

    }


    public static void main(String[] args){
        int r1, r2, sum;
        r1 = 100;
        r2 = 100;
        sum = r1 + r2;
        System.out.println(sum);
        Firstpro obj = new Firstpro();

        obj.add(5, 10);
        obj.sub1();
        obj.mul1();
        obj.div1();
        obj.boo1();






        }

    }