package main;

public class Rectangle extends Parallelogram {

	public Rectangle(Point a, Point b, Point c, Point d) {
		super(a, b, c, d);	
	}
	
	public static boolean isRectangle(Parallelogram parallelogram) {	
		return parallelogram instanceof Rectangle ? true : false;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return super.getArea();
	}
}