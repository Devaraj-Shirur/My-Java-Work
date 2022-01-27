package BasicMethods;

public class AOS_methodbyreturntype 
{
	public static void main(String[] args)
	{
		double returned_area=area();
		System.out.println("Area of the triangle is : "+returned_area);
	}

public static double area()
{
	int l=3; 
	int h=4;
	double returned_area=l*h;
	return 0;
	}
}