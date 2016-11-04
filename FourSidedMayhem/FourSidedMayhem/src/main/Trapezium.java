package main;

public class Trapezium extends Quadrilateral {
	
	private double longBase;
	private double shortBase;
	private double slantingSide1;
	private double slantingSide2;

	public Trapezium(Point A, Point B, Point C, Point D) {
		super(A, B, C, D);
		// TODO Auto-generated constructor stub
	}
	
	
	public boolean isTrapezium(Quadrilateral q)
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

}
