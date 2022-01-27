  package BasicMethods;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		boolean flag = true;
		for(int i=2; i<n; i++) {
			if(n%i==0) {
			flag = false;
			}
		}
		if(flag==true) {
			System.out.println("it is a prime number");
		}
		else {
			System.out.println("it is not a prime number");
		}
	}

}