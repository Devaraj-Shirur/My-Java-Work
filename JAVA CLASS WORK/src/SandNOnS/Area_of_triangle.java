package SandNOnS;

public class Area_of_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Triangle().area();
		System.out.println(" "+new Triangle().a);

	}

}
class Triangle
{
	int l=2, h=2;
	double a =(l*h)/2;
	void area()
	{
		System.out.println("the area of the triangle");
	}
}
