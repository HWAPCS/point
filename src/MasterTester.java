import java.util.*;

public class MasterTester {
	public static void main (String args[]) {
		Scanner s = new Scanner (System.in);
		Point firstPoint = new Point (0,1);
		Point secondPoint = new Point (0,0);
		System.out.println(firstPoint.distance(secondPoint));
	}
}
