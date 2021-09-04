import java.io.*;

class sample34
{
	public static void main (String[]args) throws IOException
	{
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";

		System.out.println("Œ‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		str = br.readLine();
		int num = Integer.parseInt(str);

		if( !(num >= 1 && num <= 12)){
			System.out.println("Œ‚ªŠÔˆá‚Á‚Ä‚¢‚Ü‚·");
			return;
		}	
			
			switch(num){
				case 6:
				case 12:
					System.out.println("Õ“ú‚Í‚ ‚è‚Ü‚¹‚ñ");
					break;
				
				case 1:
					System.out.println("1Œ1“úFŒ³’U");
					System.out.println("1Œ13“úF¬l‚Ì“ú");
					break;
				case 2:
					System.out.println("2Œ11“úFŒš‘‹L”O‚Ì“ú");
					System.out.println("2Œ23“úF“Vc’a¶“ú");
					break;
				case 3:
					System.out.println("3Œ20“úFt•ª‚Ì“ú" );
					break;
				case 4:
					System.out.println("4Œ29“úFº˜a‚Ì“ú");
					break;
				case 5:
					System.out.println("5Œ3“úFŒ›–@‹L”O‚Ì“ú");
					System.out.println("5Œ4“úF‚İ‚Ç‚è‚Ì“ú");
					System.out.println("5Œ5“ú:‚±‚Ç‚à‚Ì“ú");
					break;
				case 7:
					System.out.println("7Œ23“úFŠC‚Ì“ú");
					System.out.println("7Œ24“úFƒXƒ|[ƒc‚Ì“ú");
					break;
				case 8:
					System.out.println("8Œ11“úFR‚Ì“ú");
					break;
				case 9:
					System.out.println("9Œ21“úFŒh˜V");
					System.out.println("9Œ22“úFH•ª‚Ì“ú");
					break;
				case 11:
					System.out.println("11Œ3“ú:ƒXƒ|[ƒc‚Ì“ú");
					System.out.println("11Œ23“úFŒh˜VŠ´Ó‚Ì“ú");
					break;
			}
		
	}
}