package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Point;

public class PointTest {

	@Test
	public void testPoint() {
		Point point = new Point(10.0, 10.0);
		assertEquals(point == null, "A new Point was not created.");
	}

	@Test
	public void testGetX() {
		Point point = new Point(10.0, 10.0);
		double retreivedValue = point.getX();
		assertEquals(retreivedValue == 10.0, "The getX method retreived the wrong value.");
	}

	@Test
	public void testGetY() {
		Point point = new Point(10.0, 10.0);
		double retreivedValue = point.getY();
		assertEquals(retreivedValue == 10.0, "The getY method retreived the wrong value.");
	}

	@Test
	public void testDistanceTo() {
		Point point = new Point(9.0, 7.0);
		Point point2 = new Point(3.0, 2.0);
		
		double value = point.distanceTo(point2);
		assertEquals(, "");
	}

	@Test
	public void testToString() {
		Point point = new Point(9.0, 7.0);
		String value = point.toString();
		assertEquals(value.equals("X:9.00, Y:7.00"), "The toString method did not return the correct value.");
	}
}
