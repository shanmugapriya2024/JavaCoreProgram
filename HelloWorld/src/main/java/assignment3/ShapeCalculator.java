package assignment3;

public class ShapeCalculator {
    public int area(int radius1) {
        System.out.println("Area of Circle");
        int Circle = radius1*radius1; //r1*r2
        return Circle;
    }

    public int area(int length, int width) {
        System.out.println("Area of Rectangle");
        int rectangle = length + width; //l+w
        return rectangle;
    }

    public float area(int base, int height,float width) {
        System.out.println("Area of Triangle");
        float triangle = base+height+width;
        return triangle;
    }


    public static void main(String[] args) {
        ShapeCalculator c = new ShapeCalculator();
        System.out.println("Circle : " + c.area(5) );
        System.out.println("Rectangle : " + c.area(30,30));
        System.out.println("Triangle :" + c.area(4,5,7.4f));


    }


}