package Interfaces3;

public class ArtsCollege implements College {

    @Override
    public void courses() {
        System.out.println("BBA"+" " +"BCA" +" " +"BSC" +" "  +"BCOM");
    }

    @Override
    public void noOfStudents() {
        System.out.println(200);
    }

}
