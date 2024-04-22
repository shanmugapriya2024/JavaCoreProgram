package encapsulalation;

public class Person {
    private String name;
    private int age;
    private int accountNo;
    private String dob;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public static void main(String[] args) {
        Person p = new Person();
       // p.name = "Jovitha";
        p.setName("Jovitha");
       // p.age = 10;
        p.setAge(10);
      //  p.accountNo = 12345;
        p.setAccountNo(12345);
       // p.dob =  "06/25/2013";
        p.setDob("06/25/2013");
        System.out.println("name :"  + p.getName());
        System.out.println("age :"  + p.getAge());
        System.out.println("accountno :"  + p.getAccountNo());
        System.out.println("dob :" + p.getDob());



    }
}
