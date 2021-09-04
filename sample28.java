import java.io.*;

class sample28
{
	public static void main (String[]args) throws IOException
	{
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		
		System.out.println("®”‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		str = br.readLine();
		int res =Integer.parseInt(str);
		
		switch(res){
		case 1 :
			System.out.println("1‚ª“ü—Í‚³‚ê‚Ü‚µ‚½");
			break;
		case 2 :
			System.out.println("2‚ª“ü—Í‚³‚ê‚Ü‚µ‚½");
			break;
		default :
			System.out.println("1‚©2‚ğ“ü—Í‚µ‚Ä‰º‚³‚¢");
			break;
		}
		
	}
}