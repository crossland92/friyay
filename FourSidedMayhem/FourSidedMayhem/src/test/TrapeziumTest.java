package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Line;
import main.Parallelogram;
import main.Point;
import main.Trapezium;

public class TrapeziumTest {

	@Test
	public void testifTrapezium() {
		Line line1 = new Line(new Point(0,0),new Point(10,0));
		Line line2 = new Line(new Point(10,0),new Point(8,5));
		Line line3 = new Line(new Point(8,5),new Point(3.3,5));
		Line line4 = new Line(new Point(3.3,5),new Point(0,0));		
		
		assertEquals(true, Trapezium.isTrapezium(line1, line2, line3, line4));
		
	}
}
