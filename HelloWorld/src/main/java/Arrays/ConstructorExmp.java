package Arrays;

public class ConstructorExmp {
    public int var =100;

    public String str ="Hello I am constructor";

    public ConstructorExmp() {
        System.out.println("**Constructor Initilization ***" + var);
        System.out.println("**Constructor loaded ***" + str);

    }


    public  void testMethod(String v){
        System.out.println("Hello testMethod :" + v);

    }
    public static void main(String[] args) {

        ConstructorExmp obj = new ConstructorExmp();
        obj.testMethod("Priya");
        }

    }

