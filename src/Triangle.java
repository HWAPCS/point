package src;


public class Triangle
{
    //instance variables
    double side1;
    double side2;
    double side3;
    
    //constructors
    public Triangle(int side1, int side2, int side3)
    {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    //methods
    public double computePerimeter()
    {
        return side1+side2+side3;
    }
    
    //getters and setters
    
    public double getSide1()
    {
        return side1;
    }
    
    public double getSide2()
    {
        return side2;
    }
    
    public double getSide3()
    {
        return side3;
    }
    
    public void setSide1(int value)
    {
        this.side1 = value;
    }
    
    public void setSide2(int value)
    {
        this.side2 = value;
    }
    
    public void setSide3(int value)
    {
        this.side3 = value;
    }
}
    