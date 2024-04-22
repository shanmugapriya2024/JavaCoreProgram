package OverLoading;

public class Overload1 {


    public int add (int x,int y){
        int sum= x+y;
        return sum;

    }
      public void add (float a,float b) {
        float sum = a+b;
          System.out.println("add : " +sum);

      }
      public double add ( double a,double b, double c){
        double sum = a+ b+c;
        return sum;

      }

    public String add (String x,String y){
        String sum= x+ " " +y;
        return sum;

    }

    public static void main(String[] args) {
        Overload1 o = new Overload1();
        o.add(15.3f,14.3f);
        System.out.println("add : " + o.add(20,30));
        //System.out.println("add : " + o.add(15.3f,14.1f));
        System.out.println("add : " + o.add(25.30,30.40,40.33));
        System.out.println("add two Strings : " + o.add("Priya","Sendhil"));


    }


    }


