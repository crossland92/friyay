package main;

import java.util.Scanner;

public class TestProg {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		try {
			// Get the Shape type from the User.
			boolean needShape = true;
			while (needShape) {
				System.out.print("Please select shape (t = Trap): ");
				String input = scanner.next();
				if (input.equals("T") || input.equals("t")) {
					needShape = false;
				}
			}
			
			Point[] points = new Point[4];

			int numberOfPoints = 0;
			while (numberOfPoints < 4) {
				System.out.print("Please enter point x: ");
				double x = scanner.nextDouble();
				System.out.print("Please enter point y: ");
				double y = scanner.nextDouble();
								
				points[numberOfPoints] = new Point(x, y);
				System.out.println("Point " + (numberOfPoints + 1) + " created");
				numberOfPoints++;
			}

		} catch (Exception e) {
			System.out.println("We messed up... sorry.");
		} finally {
			scanner.close();
		}
	}
}
