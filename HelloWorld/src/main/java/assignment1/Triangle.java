package assignment1;

import assignment1.Shape;




public class Triangle extends Shape{
    @Override
    public float calculateArea(int x, int y) {
        //Triangle area = = 0.5f*l*w; (1/2*l*b)
        float triangle = 0.5f*x*y;
        return triangle;


    }

    public float calculatePerimeter ( int a, int b, int c ){

        //Triange perimeter = a+b+c
        float triangle = a+b+c;
        return triangle;


    }
}


