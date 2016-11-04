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
		double x1 = this.x;
		double x2 = point.getX();
		double y1 = this.y;
		double y2 = point.getY();
		
		double xDifference = (x1 - x2) * (x1 - x2);
		double yDifference = (y1 - y2) * (y1 - y2);
		
		return Math.sqrt(xDifference + yDifference);
	}

	@Override
	public String toString() {
		int numberOfPlacesToRoundTo = 2;
		double roundedX = new BigDecimal(this.x).setScale(numberOfPlacesToRoundTo, RoundingMode.HALF_UP).doubleValue();
		double roundedY = new BigDecimal(this.y).setScale(numberOfPlacesToRoundTo, RoundingMode.HALF_UP).doubleValue();
		return "X:" + roundedX + ", Y:" + roundedY;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	
}
