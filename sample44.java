import java.io.*;

public class sample44
{
	public static void main (String[]args) throws IOException
	{

		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		int sum = 0;
			
		System.out.println("������͂��Ă�������");
		str = br.readLine();
		int num2 = Integer.parseInt(str);
			
		
		for(int num1 = 1; num1 <= num2; num1++){
			sum = sum + num1;
			}
			System.out.println("���v��" + sum);
	}
}