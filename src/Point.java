
import java.util.*;

public class Point {

	private double x;
	private double y;

	public Point (double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getDistance	(Point otherPoint) { return(Math.sqrt(Math.pow(this.x-otherPoint.getX(), 2)+Math.pow(this.y-otherPoint.getY(), 2))); }

	public double getSlope 		(Point otherPoint) { return((this.x-otherPoint.getX())/(this.y-otherPoint.getY())); }

	public double getX() { return(x); }

	public double getY() { return(y); }

	public void 	setX() { this.x = x; }

	public void 	setY() { this.y = y; }
}
