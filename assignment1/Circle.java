package assignment1;

public class Circle extends Shape {

    //Shape class - method Override
    public float calculateArea (int r1 , int r2)
    {
        //Circle area = 3.14*r*r
        float area = 3.14f*r1*r2;
        return area;
    }

    public float calculatePerimeter (int r1, int r2, int r3)
    {
        //Circle area = 2*3.14*r
        float area = 2*3.14f*r1;
        return area;
    }
}
