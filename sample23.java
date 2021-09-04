import java.io.*;

class sample23
{
	public static void main (String[]args) throws IOException
	{
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		
		System.out.println("”N—î‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		str = br.readLine();
		int num =Integer.parseInt(str);
		
		if(num >= 20){
			
			if(num >= 50){
			System.out.println("50ÎˆÈã‚Å‚·");
			}
			
			else{
			System.out.println("20`49Î‚Å‚·");
			}
			
		}
		else if(num >= 10){
			System.out.println("10`19Î‚Å‚·");
		}
		
		else{
			System.out.println("0`9Î‚Å‚·");
		}
		
	}
}