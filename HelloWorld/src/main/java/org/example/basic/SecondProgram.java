package org.example.basic;

public class SecondProgram {

    public int add(int j, int k){
        int sum = j + k;
        System.out.println(sum);
        return sum;
    }
    public void sub(int a, int b){
        int sub = a - b;
        System.out.println(sub);
    }

    private void testMeth(){
        int h = 300;
        int k = 200;
        int sub = h - k;
        System.out.println("Private: "+sub);
    }


    public static void main(String[] args){
        System.out.println("second program");
        SecondProgram obj = new SecondProgram();
        obj.add(300,400);
        obj.sub(200, 100);
        obj.testMeth();
        College college = new College();
        System.out.println("The Age is " + college.age);
        System.out.println("The Course is: " +  college.course );
        System.out.println("The Grade is : "  + college.grade);


    }

}
