package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Line;
import main.Point;

public class LineTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetLength(){
		Point point1 = new Point (0,10);
		Point point2 = new Point (10,10);
		Line line = new Line(point1, point2);
		
		assertEquals(10.0, line.getLength(), 0.01);
		
	}
}
 