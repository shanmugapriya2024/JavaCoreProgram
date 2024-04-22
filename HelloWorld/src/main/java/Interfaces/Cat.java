package Interfaces;

public class Cat implements Animal {

    @Override
    public void eat() {
        System.out.println(" Cat eat fish");
    }

    @Override
    public void sleep() {
        System.out.println(" The cat sleeps 10 hours a day");

    }
}
