package main;

public abstract class Quadrilateral {

	protected Point point1;
	protected Point point2;
	protected Point point3;
	protected Point point4;
	protected Line side1;
	protected Line side2;
	protected Line side3;
	protected Line side4;;
	private double perimeter;
	private double area;
	
	
	public Quadrilateral(Point A, Point B, Point C, Point D){
		this.point1 = A;
		this.point2 = B;
		this.point3 = C;
		this.point4 = D;
		
	}
	
	public double getPerimeter() {
		
		return perimeter;
	}
	
	public abstract double getArea();
	
	@Override
	public String toString() {
		return "Quadrilateral [point2=" + point2 + ", point3=" + point3 + ", point4=" + point4 + ", side1=" + side1
				+ ", side2=" + side2 + ", side3=" + side3 + ", side4=" + side4 + ", point1=" + point1 + ", perimeter="
				+ perimeter + ", area=" + area + "]";
	}

	public Point getPoint1() {
		return point1;
	}

	public void setPoint1(Point point1) {
		this.point1 = point1;
	}

	public Point getPoint2() {
		return point2;
	}

	public void setPoint2(Point point2) {
		this.point2 = point2;
	}

	public Point getPoint3() {
		return point3;
	}

	public void setPoint3(Point point3) {
		this.point3 = point3;
	}

	public Point getPoint4() {
		return point4;
	}

	public void setPoint4(Point point4) {
		this.point4 = point4;
	}

	public Line getSide1() {
		return side1;
	}

	public void setSide1(Line side1) {
		this.side1 = side1;
	}

	public Line getSide2() {
		return side2;
	}

	public void setSide2(Line side2) {
		this.side2 = side2;
	}

	public Line getSide3() {
		return side3;
	}

	public void setSide3(Line side3) {
		this.side3 = side3;
	}

	public Line getSide4() {
		return side4;
	}

	public void setSide4(Line side4) {
		this.side4 = side4;
	}
	
	

}
