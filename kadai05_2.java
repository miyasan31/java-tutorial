import java.io.*;

public class kadai05_2{

	public static void main(String[] args) throws IOException{
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		
		System.out.println("¶”NŒ“ú‚Ì¼—ï‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		str = br.readLine();
		int b_yy =Integer.parseInt(str);
		
		System.out.println("¶”NŒ“ú‚ÌŒ‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		str = br.readLine();
		int b_mm =Integer.parseInt(str);
		
		System.out.println("¶”NŒ“ú‚Ì“ú‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		str = br.readLine();
		int b_dd =Integer.parseInt(str);
		
		
		day_of_week obj1 = new day_of_week();
		int b_wk = obj1.youbi(b_yy, b_mm, b_dd);
		
		String week = "";
		switch(b_wk){
			case 1: week = "“ú"; break;
			case 2: week = "Œ"; break;
			case 3: week = "‰Î"; break;
			case 4: week = "…"; break;
			case 5: week = "–Ø"; break;
			case 6: week = "‹à"; break;
			case 7: week = "“y"; break;
		}
		
		
		day_of_week obj2 = new day_of_week();
		int b_days = obj2.b_days(b_yy, b_mm, b_dd);
		
		
		day_of_week obj3 = new day_of_week();
		int wareki = obj3.wareki(b_yy, b_mm, b_dd);

		
		String nengou = "";
		switch(wareki){
			case 1: nengou = "—ß˜a"; break;
			case 2: nengou = "•½¬"; break;
			case 3: nengou = "º˜a"; break;
			case 4: nengou = "‘å³"; break;
			case 5: nengou = "–¾¡"; break;
		}
		
		
		day_of_week obj4 = new day_of_week();
		int wareki_yy = obj4.wareki_yy(b_yy, wareki);
		
		System.out.println("‚ ‚È‚½‚Í" + nengou + wareki_yy + "”N" + b_mm + "Œ" + b_dd + "“úi" + week + ")‚Å‚·");
		System.out.println("—ˆ”N‚Ì’a¶“ú‚Ü‚Å‚ ‚Æ" + b_days + "“ú‚Å‚·");
	}
}





