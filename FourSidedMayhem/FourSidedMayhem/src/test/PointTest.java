package test;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.junit.Test;

import main.Point;

public class PointTest {

	@Test
	public void testPoint() {
		Point point = new Point(10.0, 10.0);
		assertFalse(point == null); // Was a new Object created.
	}

	@Test
	public void testGetX() {
		Point point = new Point(10.0, 10.0);
		double retrievedValue = point.getX();
		assertEquals(10.0, retrievedValue, 0.00); // Does the retrievedValue equal 10.00, with the precision of 0.00
	}

	@Test
	public void testGetY() {
		Point point = new Point(10.0, 10.0);
		double retrievedValue = point.getY();
		assertEquals(10.0, retrievedValue, 0.00);  // Does the retrievedValue equal 10.00, with the precision of 0.00
	}

	@Test
	public void testDistanceTo() {
		Point point = new Point(9.0, 7.0);
		Point point2 = new Point(3.0, 2.0);
		double value = point.distanceTo(point2);
		assertEquals(7.81, value, 0.01);   // Does the retrievedValue equal what we expected.
	}

	@Test
	public void testToString() {
		Point point = new Point(9.0, 7.0);
		assertEquals(new String("X:9.0, Y:7.0"), point.toString()); // Does the toString method print out the String as expected.
	}
}
