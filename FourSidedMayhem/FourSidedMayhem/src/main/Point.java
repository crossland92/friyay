package main;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Point {
	
	private double x;
	private double y;
	
	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double distanceTo(Point point) {
		return 0.0;
	}

	@Override
	public String toString() {
		int numberOfPlacesToRoundTo = 2;
		double roundedX = new BigDecimal(this.x).setScale(numberOfPlacesToRoundTo, RoundingMode.HALF_UP).doubleValue();
		double roundedY = new BigDecimal(this.y).setScale(numberOfPlacesToRoundTo, RoundingMode.HALF_UP).doubleValue();
		return "X:" + roundedX + ", Y:" + roundedY;
	}
}
