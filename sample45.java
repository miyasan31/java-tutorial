import java.io.*;

public class sample45
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
		
		int max = num;
		int min = num;
						
			while(num != -1){
			sum = sum + num;
			cnt = cnt+ 1;
			
			if(max > num){
			max = num;
			}
			if(min < num){
			min = num;
			}
			
			System.out.println("���̓��_����͂��Ă�������");	
			str = br.readLine();
			num = Integer.parseInt(str);	
			}
		
		System.out.println("���v�_" + sum);
		System.out.print("���ϓ_" + (sum / cnt ) + "\t");		
		for(int i = 0; i<=sum/cnt/5; i++){
			System.out.print("*");
		}	
		
		System.out.print("\n");
		
		System.out.print("�ō��_" + max + "\t");
		for(int i = 0; i<=max/5; i++){
			System.out.print("*");
		}
		
		System.out.print("\n");
		
		System.out.print("�Œ�_" + min + "\t");
		for(int i = 0; i<=min/5; i++){
			System.out.print("*");
		}		
	}
}