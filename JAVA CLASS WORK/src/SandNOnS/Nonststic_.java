package SandNOnS;

public class Nonststic_ {
	public static void main(String[] args)
	{
		new Sample().demo1();
		System.out.println(" "+new Sample().S);
	}
}
class Sample
{
	String S="JAVA";
	void demo1()
	{
		System.out.println("Object oriented");
	}
}