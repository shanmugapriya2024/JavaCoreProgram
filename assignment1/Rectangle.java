package assignment1;

public class Rectangle  extends Shape{

    public float calculateArea (int l, int w)
    {
        // area rectangle= length*width
        float rectangle = l*w;
        return rectangle;
    }

    public float calculatePerimeter (int l , int w, int x)
    {
        //rectangle area = 2(l+w)
        float perimeter = 2f*(l+w);
        return perimeter;
    }
}
