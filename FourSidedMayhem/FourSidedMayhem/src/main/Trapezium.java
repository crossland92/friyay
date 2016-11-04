package main;

public class Trapezium extends Quadrilateral {
	
	private double longBase;
	private double shortBase;
	private double slantingSide1;
	private double slantingSide2;

	public Trapezium(Point A, Point B, Point C, Point D) {
		super(A, B, C, D);
		Line l1 = new Line(A, B);
		Line l2 = new Line(B, C);
		Line l3 = new Line(C, D);
		Line l4 = new Line(D, A);
		isTrapezium(l1, l2, l3,l4);
	}
	
	
	public boolean isTrapezium(Line l1, Line l2, Line l3, Line l4)
	{
		
		
		return false;
	}
	
	
	public void calculateFourSides()
	{
		
	}

	
	/*
	 * Getters and setters
	 */
	public double getLongBase() {
		return longBase;
	}

	public void setLongBase(double longBase) {
		this.longBase = longBase;
	}

	public double getShortBase() {
		return shortBase;
	}

	public void setShortBase(double shortBase)
	{
		this.shortBase = shortBase;
	}

	public double getSlantingSide1() {
		return slantingSide1;
	}

	public void setSlantingSide1(double slantingSide1) 
	{
		this.slantingSide1 = slantingSide1;
	}

	public double getSlantingSide2() 
	{
		return slantingSide2;
	}

	public void setSlantingSide2(double slantingSide2) 
	{
		this.slantingSide2 = slantingSide2;
	}


	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

}
