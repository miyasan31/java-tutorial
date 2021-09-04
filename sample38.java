import java.io.*;

public class sample38
{
	public static void main (String[]args) throws IOException
	{

		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		int num1 = 1;
		int sum = 0;
			
		System.out.println("”‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		str = br.readLine();
		int num2 = Integer.parseInt(str);
			
			
			while(num1 <= num2){
			sum = sum + num1;
			num1++;
			}
			System.out.println("‡Œv‚Í" + sum);
	}
}