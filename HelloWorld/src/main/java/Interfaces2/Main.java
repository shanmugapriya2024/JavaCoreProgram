package Interfaces2;

public class Main {
    public static void main(String[] args) {
        SouthIndian s = new SouthIndian();
        System.out.println("SouthIndian Dishes");
        s.sambar();
        s.chaat();

        NorthIndian n = new NorthIndian();
        System.out.println("NorthIndian Dishes");

        n.chaat();
        n.sambar();


    }
}

