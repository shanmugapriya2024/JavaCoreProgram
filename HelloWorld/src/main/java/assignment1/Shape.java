package assignment1;

public class Shape {

    public float calculateArea  (int x, int y) {
        return 0;

    }

    public float calculatePerimeter (int x, int y,int z) {
        return 0;
    }

    public static void main(String[] args) {
     Circle c = new Circle();
        System.out.println("Circle area : " +  c.calculateArea(5,5));
        System.out.println("Circle Perimeter:"+ c.calculatePerimeter(2,2,3) );


        Rectangle r = new Rectangle();
        System.out.println("Rectangle area : " +  r.calculateArea(5,5));
        System.out.println("Rectangle Perimeter:"+ r.calculatePerimeter(2,2,3) );

        Triangle t = new Triangle();
        System.out.println("Triangle area : " + t.calculateArea(5,5));
        System.out.println("Triangle Perimeter:"+ t.calculatePerimeter(2,2,3) );





    }


}

