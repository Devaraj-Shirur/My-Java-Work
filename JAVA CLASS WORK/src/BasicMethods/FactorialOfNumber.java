package BasicMethods;

public class FactorialOfNumber {
	public static void main(String[] args) {
		
		int n = 3;
		int fact = 1;
		for(int i=n;i>=1;i--) {
			fact=fact*i;
		}
		System.out.println(+fact);
	}
}
