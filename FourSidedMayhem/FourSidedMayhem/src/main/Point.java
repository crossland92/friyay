package main;

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
		return super.toString();
	}
}