package main;

public abstract class Quadrilateral {
	
	private int point2;
	private int point3;
	private int point4;
	private int side1;
	private int side2;
	private int side3;
	private int side4;
	private int point1;
	private double perimeter;
	private double area;
	
	
	public Quadrilateral(Point A, Point B, Point C, Point D){
		
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
	
	public int getPoint1() {
		return point1;
	}
	public void setPoint1(int point1) {
		this.point1 = point1;
	}
	public int getPoint2() {
		return point2;
	}
	public void setPoint2(int point2) {
		this.point2 = point2;
	}
	public int getPoint3() {
		return point3;
	}
	public void setPoint3(int point3) {
		this.point3 = point3;
	}
	public int getPoint4() {
		return point4;
	}
	public void setPoint4(int point4) {
		this.point4 = point4;
	}
	public int getSide1() {
		return side1;
	}
	public void setSide1(int side1) {
		this.side1 = side1;
	}
	public int getSide2() {
		return side2;
	}
	public void setSide2(int side2) {
		this.side2 = side2;
	}
	public int getSide3() {
		return side3;
	}
	public void setSide3(int side3) {
		this.side3 = side3;
	}
	public int getSide4() {
		return side4;
	}
	public void setSide4(int side4) {
		this.side4 = side4;
	}
	
	

}
