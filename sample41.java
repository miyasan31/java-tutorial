import java.io.*;

public class sample41
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
		
		System.out.println("合計は" + sum);
		System.out.println("平均は" + (sum / cnt));
		System.out.println("最大値は" + max);
		System.out.println("最小値は" + min);
		
	}
}