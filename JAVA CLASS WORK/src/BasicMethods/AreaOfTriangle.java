package BasicMethods;

import java.util.Scanner;

public class AreaOfTriangle {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter the length");
		double l= s.nextDouble();
		System.out.println("enter the width");
		double w= s.nextDouble();
		
		double area=l*w;
		System.out.println("area of the rectangle   "+area);
		
	}

}
 