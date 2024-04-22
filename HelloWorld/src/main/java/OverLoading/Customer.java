package OverLoading;
 public class Customer {


     public void fillForm(String x,int y,String z){
         System.out.println("Overloading with 3 params");
         System.out.println("Customer name: " + x + " Ph :"+ y + "email:" + z);

     }
     public void fillForm(String str, int x){
         System.out.println("Overloading with 2 params");
         System.out.println("Customer name: " + str + " Ph :"+ x );

     }

     public static void main(String[] args) {
         Customer c1 = new Customer();
         c1.fillForm("Sendhil",2019936182,"email@gmail.com");

         Customer c2 = new Customer();
         c2.fillForm("Priya",224501777);


     }
 }












