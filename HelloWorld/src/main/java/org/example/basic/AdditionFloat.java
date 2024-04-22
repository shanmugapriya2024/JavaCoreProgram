package org.example.basic;

public class AdditionFloat {

    public  void add(){
        int a = 3;
        int b = 6;
        int c = b+a;
        System.out.println("Print Addition:" + c);

    }

    public  void sub(){
        int a = 3;
        int b = 6;

        int c = b-a;
        System.out.println("Print subtraction:" + c);

    }
    public void multiply(){
        int w = 4;
        int r = 3;
        int t = w*r;
        System.out.println("print multiplication: " + t);
    }

        public static void main(String[] args) {
            System.out.println("Welcome Learning");
            double a, b, c;
            a = 100.45d;
            b = 290.23d;
            c = a + b;
            System.out.println(c);
            AdditionFloat obj1 = new AdditionFloat();
            obj1.sub();
            obj1.add();
            obj1.multiply();



        }
    }
