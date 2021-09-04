import java.io.*;

class sample29
{
	public static void main (String[]args) throws IOException
	{
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		
		System.out.println("•¶Žš‚ð“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		str = br.readLine();
		
		switch(str){
		case "‚ ‚¢‚¤‚¦‚¨" :
			System.out.println(str + "‚ª“ü—Í‚³‚ê‚Ü‚µ‚½");
			break;
		case "‚©‚«‚­‚¯‚±" :
			System.out.println(str + "‚ª“ü—Í‚³‚ê‚Ü‚µ‚½");
			break;
		default :
			System.out.println("“ü—Í‚ªŠÔˆá‚Á‚Ä‚¢‚Ü‚·");
			break;
		}
		
	}
}