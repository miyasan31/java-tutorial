import java.io.*;

class sample36
{
	public static void main (String[]args) throws IOException
	{
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		
		System.out.println("‰È–Ú‹L†‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		str = br.readLine();
		
		switch(str){
		case "JV15":
			System.out.println("ŒÃ“cæ¶");
			break;
		case "CS15":
			System.out.println("’†’Jæ¶");
			break;
		case "WB15":
			System.out.println("RŒûæ¶");
			break;
		default :
			System.out.println("ŠY“–‚·‚éæ¶‚Í‚¢‚Ü‚¹‚ñ");
			break;
		}
		
	}
}