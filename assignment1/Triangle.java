package assignment1;

public class Triangle extends Shape{
    public float calculateArea (int l, int w)
    {
        // area Triangle= 1/2 *(length*width)
        float rectangle = 0.5f*l*w;
        return rectangle;
    }

    public float calculatePerimeter (int a , int b, int c)
    {
        // Triangle perimeter = side1+ side2 + side3
        float triangle = a+b+c;
        return triangle;
    }



}
