package encapsulalation;

public class Student {

    private  String name;
    private int age;
    private String grade;
    private  String dob;
    private String schoolname;
    private int totmarks;

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

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    public int getTotmarks() {
        return totmarks;
    }

    public void setTotmarks(int totmarks) {
        this.totmarks = totmarks;
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Sahana");
        s.setAge(16);
        s.setDob("11/29/2007");
        s.setGrade("10");
        s.setSchoolname("Prosper high school");
        s.setTotmarks(1000);
        System.out.println("name :"         + s.getName());
        System.out.println("age :"          +  s.getAge());
        System.out.println("dob :"          + s.getDob());
        System.out.println("grade :"        +s.getGrade());
        System.out.println("schoolname :"   + s.getSchoolname());
        System.out.println("totalmarks :"   +  s.getTotmarks());
    }
}
