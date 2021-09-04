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
			
		System.out.println("得点を入力してください");
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
			
			System.out.println("次の得点を入力してください");	
			str = br.readLine();
			num = Integer.parseInt(str);	
			}
		
		System.out.println("合計点" + sum);
		System.out.print("平均点" + (sum / cnt ) + "\t");		
		for(int i = 0; i<=sum/cnt/5; i++){
			System.out.print("*");
		}	
		
		System.out.print("\n");
		
		System.out.print("最高点" + max + "\t");
		for(int i = 0; i<=max/5; i++){
			System.out.print("*");
		}
		
		System.out.print("\n");
		
		System.out.print("最低点" + min + "\t");
		for(int i = 0; i<=min/5; i++){
			System.out.print("*");
		}		
	}
}