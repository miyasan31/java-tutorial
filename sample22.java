import java.io.*;

class sample22
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
			System.out.println("20ÎˆÈã‚Å‚·");
		}
		else if(num >= 10){
			System.out.println("10`19Î‚Å‚·");
		}
		else{
			System.out.println("10Î–¢–‚Å‚·");
		}
	}
}