public class APLine
{
    //instance variables
    double a;
    double b;
    double c;

    //constructors
    public APLine(double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public APLine(Point point1, Point point2) {
      double slope = point1.getSlope(point2);
      this.a = - slope;
      this.b = 1;
      this.c = slope * point1.getX() - point1.getY();
    }

    //methods
    public double getSlope()
    {
        return -a/b;
    }

    public boolean isOnLine(int x, int y)
    {
        if(this.a * x + this.b *y + this.c == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean isOnLine(Point point)
    {
        if(this.a * point.getX() + this.b * point.getY() + this.c == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    //setters and getters
    public double getA()
    {
        return this.a;
    }

    public double getB()
    {
        return this.b;
    }

    public double getC()
    {
        return this.c;
    }

    public void setA(int a)
    {
        this.a = a;
    }

    public void setB(int b)
    {
        this.b = b;
    }

    public void setC(int c)
    {
        this.c = c;
    }

}
