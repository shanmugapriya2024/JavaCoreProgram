package Interfaces;

public class Bird implements Animal{

    @Override
    public void eat() {
        System.out.println("The birds eat insects");
    }

    @Override
    public void sleep() {
        System.out.println("Most birds sleeps throughout the dinner");

    }
}
