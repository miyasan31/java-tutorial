import java.io.*;

class sample35
{
	public static void main (String[]args) throws IOException
	{
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		
		System.out.println("‰È–Ú‹L†‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		str = br.readLine();
		
		if(str.equals("JV15")){
		System.out.println("ŒÃ“cæ¶");
		}
		else if(str.equals("CS15")){
		System.out.println("’†’Jæ¶");
		}
		else if(str.equals("WB15")){
		System.out.println("RŒûæ¶");
		}
		else{
		System.out.println("ŠY“–‚·‚éæ¶‚Í‚¢‚Ü‚¹‚ñ");
		}
	}
}
