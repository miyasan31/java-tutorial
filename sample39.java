import java.io.*;

public class sample39
{
	public static void main (String[]args) throws IOException
	{

		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		int sum = 0;
			
		System.out.println("���_����͂��Ă�������");
		str = br.readLine();
		int num = Integer.parseInt(str);
						
			while(num != -1){
			sum = sum + num;
				
			System.out.println("���̓��_����͂��Ă�������");	
			str = br.readLine();
			num = Integer.parseInt(str);	
				
			}
		
		System.out.println("���v��" + sum);
	}
}