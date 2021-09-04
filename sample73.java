import java.io.*;
import java.util.Date;
import java.util.Calendar;

public class sample73{

	public static void main(String[] args) throws IOException{
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		
		System.out.println("’a¶“ú‚Ì¼—ï‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		str = br.readLine();
		int b_yy =Integer.parseInt(str);
		
		System.out.println("’a¶“ú‚ÌŒ‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		str = br.readLine();
		int b_mm =Integer.parseInt(str);
		
		System.out.println("’a¶“ú‚Ì“ú‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		str = br.readLine();
		int b_dd =Integer.parseInt(str);
		
		
		Date today = new Date(); //Œ»İæ“¾
		
		Calendar cal = Calendar.getInstance(); //CalendarƒNƒ‰ƒXƒIƒuƒWƒFƒNƒgì¬
		
		cal.setTime(today); //Œ»İ“ú•tİ’è
	
		int set_yy = b_yy; 
		int set_mm = b_mm;
		int set_dd = b_dd;
		cal.set(Calendar.YEAR,set_yy); 
		cal.set(Calendar.MONTH,set_mm-1); 
		cal.set(Calendar.DATE,set_dd); 
		
		int wk = cal.get(Calendar.DAY_OF_WEEK);
		String week = "";
		
		switch(wk){
			case 1: week = "“ú"; break;
			case 2: week = "Œ"; break;
			case 3: week = "‰Î"; break;
			case 4: week = "…"; break;
			case 5: week = "–Ø"; break;
			case 6: week = "‹à"; break;
			case 7: week = "“y"; break;
		}
		
		System.out.println("’a¶“ú‚Í" + week + "—j“ú‚Å‚·");
	}
}





