import java.io.*;

class sample24
{
	public static void main (String[]args) throws IOException
	{
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		
		System.out.println("”N—î‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		str = br.readLine();
		int num =Integer.parseInt(str);
		
		if(num >= 50){
			System.out.println("50ÎˆÈã‚Å‚·");
		}
		else if(num >= 40){
			System.out.println("40‘ã‚Å‚·");
		}
		else if(num >= 30){
			System.out.println("30‘ã‚Å‚·");
		}
		else if(num >= 20){
			System.out.println("20‘ã‚Å‚·");
		}
		else if(num >= 10){
			System.out.println("10‘ã‚Å‚·");
		}
		else{
			System.out.println("10Î–¢–‚Å‚·");
		}

	}
}