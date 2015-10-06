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
