import java.io.*;

class sample21
{
	public static void main (String[]args) throws IOException
	{
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		
		System.out.println("”N—î‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		str = br.readLine();
		int num =Integer.parseInt(str);
		
		if(num >= 20){ //20ÎˆÈã‚È‚ç‚Î‰º‚Ìˆ—‚ªÀs‚³‚ê‚é
			System.out.println("20ÎˆÈã‚Å‚·");
		}
		else{
			System.out.println("20Î–¢–‚Å‚·");
		}
	}
}