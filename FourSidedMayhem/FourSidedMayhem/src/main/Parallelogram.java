package main;

public class Parallelogram extends Trapezium {
	

	public static boolean isParrallelogram(Line a, Line b, Line c, Line d){
		
		
		if((a.getLength() == c.getLength()) && (b.getLength() == d.getLength()))
		{		
			System.out.println(b.getLength());
			System.out.println(d.getLength());
			return true;
		}
		else
			return false;
				
	}
	
	public Parallelogram(Point a, Point b, Point c, Point d){
		super(a, b, c, d);
		
		
	}
	
	public double getArea(int base, int height){
		/*double area = 0;
		
		area = base * height; //base*height
*/		
		return 0.0;		
	}
		

}
