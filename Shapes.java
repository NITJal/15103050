abstract class Shape
{
    abstract int numberOfSides();
}

class Trapezoid extends Shape
{
    private static int sides=4;
    int numberOfSides()
    {
        return sides;
    }
}

class Triangle extends Shape
{
    private static int sides=3;
    int numberOfSides()
    {
        return sides;
    }
}

class Hexagon extends Shape
{   
    private static int sides = 6;
    int numberOfSides()
    {
        return sides;
    }
}

public class Shapes
{
    public static void main(String args[])
    {
    Shape[] shapes = new Shape[3];
    Trapezoid trapezoid = new Trapezoid();
    Triangle triangle = new Triangle();
    Hexagon hexagon = new Hexagon();
    shapes[0]=trapezoid;
    shapes[1]=triangle;
    shapes[2]=hexagon;
    for(int i=0 ; i<3 ;i++)
    {
        if (i==0)
        System.out.println(" Number of sides in a Trapezoid is  "+shapes[i].numberOfSides());
        if (i==1)
        System.out.println(" Number of sides in a Triangle is  "+shapes[i].numberOfSides());
        if (i==2)
        System.out.println(" Number of sides in a Hexaagon is  "+shapes[i].numberOfSides());
    }
    }
}	


