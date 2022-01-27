package Blocks;

public class staticblock {
	staticblock()
	{
		int a=10;
		int b=5;
		int sum;
		sum=a+b;
		System.out.println(sum);		
	}
	static {
		int a=20;
		int b=5;
		int sum;
		sum=a+b;
		System.out.println(sum);		
	}
	public static void main(String[] args) {
		staticblock S1= new staticblock();
		int a=30;
		int b=5;
		int sum;
		sum=a+b;
		System.out.println(sum);
		
	}
	

}
