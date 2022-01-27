package loops;

public class evenodd_while_loop
{
	public static void main(String[] args)
	{
		even();
		odd();
	}
	public static void even()
	{
		int i=1;
		System.out.println("the even numbers are");
		while(i<=10)
		{
			if(i%2==0)
				System.out.println(" "+i);
				i++;
		}
	}
	public static void odd()
	{
		int i=1;
		System.out.println("the even numbers are");
		while(i<=10)
		{
			if(i%2!=0)
				System.out.println(" "+i);
				i++;
		}
	}
}
