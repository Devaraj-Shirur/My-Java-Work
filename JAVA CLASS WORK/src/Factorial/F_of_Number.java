package Factorial;

public class F_of_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5, fact=1;
		
		for(int i=n; i>=1; i--)
		{
			fact = fact * i;
		}
		System.out.println("The factorial of the number is: "+fact);
		

	}
	

}
