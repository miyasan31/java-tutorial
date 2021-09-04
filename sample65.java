import java.io.*;

public class sample65
{
	public static void main (String[]args) throws IOException
	{

		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		int sum = 0;
		int cnt = 0;
			
		System.out.println("“¾“_‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		str = br.readLine();
		int num = Integer.parseInt(str);
		
		int max = num;
		int min = num;
						
			while(num != -1){
			sum = sum + num;
			cnt++;

			if(max > num){
			max = num;
			}
			if(min < num){
			min = num;
			}
			
			System.out.println("Ÿ‚Ì“¾“_‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");	
			str = br.readLine();
			num = Integer.parseInt(str);	
			}
		
		tokuten obj = new tokuten();
		obj.hyouji(sum, max, min, cnt);
	}
}