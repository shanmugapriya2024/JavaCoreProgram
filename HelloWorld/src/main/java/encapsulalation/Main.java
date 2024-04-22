package encapsulalation;

public class Main {

    public static void main(String[] args) {
        System.out.println("Main");
        Student s = new Student();
        s.setName("Saisripadh");
        s.setAge(4);
        s.setDob("10/12/2019");
        s.setGrade("Prek");
        System.out.println("Name : " + s.getName());
        System.out.println("age :" + s.getAge());
        System.out.println("dob : " + s.getDob());
        System.out.println("grade :" + s.getGrade());
    }
}
