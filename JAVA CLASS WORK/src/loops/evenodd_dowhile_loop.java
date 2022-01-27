package loops;

public class evenodd_dowhile_loop {
	public static void main(String[] args)
	{
		even();
		odd();
	}
	public static void even()
	{
		int i=1;
		System.out.println("the even numbers are");
		do{
			if(i%2==0)
			System.out.println(" "+i);
			i++;
		}while(i<=10);
		
	}
	public static void odd()
	{
		int i=1;
		System.out.println("the odd numbers are");
		do {
			if(i%2!=0)
			System.out.println(""+i);
			i++;
		}while(i<=10);
	}
	

}
