import java.io.*;

public class sample43
{
	public static void main (String[]args) throws IOException
	{
	
	int sum = 0;
		for(int num1 = 1; num1 <= 10; num1++){
		sum = sum + num1;
		System.out.print("num1‚Í" + num1);
		System.out.println(" sum‚Í" + sum);
		}
	System.out.println("‡Œv‚Í" + sum);
	}
}