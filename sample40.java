import java.io.*;

public class sample40
{
	public static void main (String[]args) throws IOException
	{

		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		int sum = 0;
		int cnt = 0;
			
		System.out.println("���_����͂��Ă�������");
		str = br.readLine();
		int num = Integer.parseInt(str);
						
			while(num != -1){
			sum = sum + num;
			cnt = cnt+ 1;
			System.out.println("���̓��_����͂��Ă�������");	
			str = br.readLine();
			num = Integer.parseInt(str);	
				
			}
		
		System.out.println("���v��" + sum);
		System.out.println("���ς�" + (sum / cnt));
	}
}