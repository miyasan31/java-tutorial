import java.io.*;

public class sample37
{
	public static void main (String[]args) throws IOException
	{
	
	int num1 = 1;
	int sum = 0;
		while(num1 <= 10){
		sum = sum + num1;
		System.out.print("num1は" + num1);
		System.out.println(" sumは" + sum);
		num1++;
		}
		System.out.println("合計は" + sum);
	}
}