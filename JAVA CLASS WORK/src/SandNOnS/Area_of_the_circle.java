package SandNOnS;

public class Area_of_the_circle {
	public static void main(String[] args) 
	{
		new circle().area();
		System.out.println(""+new circle().a);
	}
}
class circle
{
	int r=3;
	double a= 3.141*r*r;
	void area()
	{
		System.out.println("Area of the circle");
	}
	}
