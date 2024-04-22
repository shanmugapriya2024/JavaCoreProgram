package assignment1;

//shape class - method override
public  class Circle extends Shape {

    @Override
    public float calculateArea(int x, int y) {
        //Circle area : 3.14f*r1*r2
        float Circle = 3.14f*x*y;
        return Circle;

    }

    public float calculatePerimeter ( int r,int r2,int p){
       // Circle Permimeter = 2*3.14f*r
        float Circle =2*3.14f*r ;
        return Circle;


    }
}




