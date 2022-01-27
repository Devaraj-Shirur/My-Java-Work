package BasicMethods;

public class CalculationofNumbers {
	int z;
	void addition(int x, int y) {
		z=x+y;
		System.out.println("Addition:"+z);
	}
	void difference(int x, int y){
		z=x-y;
		System.out.println("Difference:"+z);
	}
}
class My_Calculation extends CalculationofNumbers{
	void multiplication(int x, int y) {
		z=x*y;
		System.out.println("Multiplication:"+z);
	}
}
class Driver{
	public static void main(String[] args) {
		My_Calculation M1 = new My_Calculation();
		int x=2, y=3;
		M1.addition(x, y);
		M1.difference(x, y);
		M1.multiplication(x, y);
	}
}
