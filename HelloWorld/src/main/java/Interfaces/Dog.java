package Interfaces;

public class Dog  implements Animal{


    @Override
    public void eat() {
        System.out.println("Dog eats biscuits");
    }

    @Override
    public void sleep() {
        System.out.println("Adults dogs sleep average 12 to 14 hours a day");
    }
}
