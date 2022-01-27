package SandNOnS;

public class Area_of_rectangle {
	public static void main(String[] args) 
	{
		rectangle.method_static();
		System.out.println(" "+new rectangle().area);
	}
}
class rectangle
{
	static int l=3, b=4;
	double area=l*b;
	static void method_static()
	{
		System.out.println("Area of the rectangle");
	}
}
