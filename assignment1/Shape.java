package assignment1;

public class Shape {
    public float calculateArea (int x , int y)
    {
        return 0;
    }
    public float calculatePerimeter ( int x, int y, int z ){
        return 0;
    }

    public static void main(String[] args) {

        Circle c = new Circle();

       System.out.println("Circle Area "+ c.calculateArea(5,5));

        Rectangle r = new Rectangle();
        System.out.println("Rectange Area "+ r.calculateArea(5,5));

        Triangle t = new Triangle();
        System.out.println("Triangle Area "+ t.calculateArea(5,5));

        Circle p = new Circle();

        System.out.println("Circle Perimeter "+ p.calculatePerimeter(5,5,5));

        Triangle a = new Triangle();

        System.out.println("Triangle Perimeter "+ a.calculatePerimeter(5,7,8));

    }

}
