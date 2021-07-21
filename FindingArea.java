package Technoelevate;

public class FindingArea 
{
	public static void main(String[] args)
	{
		System.out.println("area of the circle is: " +area(0.0));
		System.out.println("area of rectangle is: "+area(0.0,3.0));
	}

	public static double area(double radius)
	{
		double area=0.0;
		double piValue=3.14;
		if(radius>0) {
			area=piValue*radius*radius;
			return area;
		}
		return -1.0;
	}
	
	public static double area(double x,double y)
	{
		double area=0.0;
		if(x>0 && y>0)
		{
			area=x*y;
			return area;
		}
		return -1.0;
	}
	
}
