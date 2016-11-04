package main;

public class Line {
	
	private Point p1;
	private Point p2;
	
	public Line (Point p1, Point p2)
	{
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public double getLength()
	{
		return p1.distanceTo(p2);
	}
	
	public double getSlope()
	{
		
		double xDifference = (p1.getX() - p2.getX());
		double yDifference = (p1.getY() - p2.getY());
		return yDifference/xDifference;
		
	
	}
	
	public Point getPoint1()
	{
		return p1;
	}
	
	public Point getPoint2()
	{
		return p2;
	}

}
