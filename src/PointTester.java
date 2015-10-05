import java.util.*;

public class PointTester {
	public static void main (String args[]) {
		Scanner s = new Scanner (System.in);
		System.out.print("Please enter the x coordinate of the first point: ");
		int x = s.nextInt();
		System.out.print("Please enter the y coordinate of the first point: ");
		int y = s.nextInt();
		Point firstPoint = new Point (x,y);
		System.out.print("Please enter the x coordinate of the second point: ");
		x = s.nextInt();
		System.out.print("Please enter the y coordinate of the second point: ");
		y = s.nextInt();
		Point secondPoint = new Point (x,y);
		System.out.println("The distance between the two points is: "+firstPoint.distance(secondPoint));

	}
}
