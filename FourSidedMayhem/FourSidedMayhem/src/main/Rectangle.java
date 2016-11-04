package main;

public class Rectangle extends Parallelogram {

	public Rectangle(Point a, Point b, Point c, Point d) {
		super(a, b, c, d);	
	}
	
	private boolean isRectangle() {	
		return false;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0.00;
	}
}