import java.io.*;
import java.util.Date;
import java.util.Calendar;

public class sample73{

	public static void main(String[] args) throws IOException{
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		
		System.out.println("誕生日の西暦を入力してください");
		str = br.readLine();
		int b_yy =Integer.parseInt(str);
		
		System.out.println("誕生日の月を入力してください");
		str = br.readLine();
		int b_mm =Integer.parseInt(str);
		
		System.out.println("誕生日の日を入力してください");
		str = br.readLine();
		int b_dd =Integer.parseInt(str);
		
		
		Date today = new Date(); //現在時刻取得
		
		Calendar cal = Calendar.getInstance(); //Calendarクラスオブジェクト作成
		
		cal.setTime(today); //現在日付設定
	
		int set_yy = b_yy; 
		int set_mm = b_mm;
		int set_dd = b_dd;
		cal.set(Calendar.YEAR,set_yy); 
		cal.set(Calendar.MONTH,set_mm-1); 
		cal.set(Calendar.DATE,set_dd); 
		
		int wk = cal.get(Calendar.DAY_OF_WEEK);
		String week = "";
		
		switch(wk){
			case 1: week = "日"; break;
			case 2: week = "月"; break;
			case 3: week = "火"; break;
			case 4: week = "水"; break;
			case 5: week = "木"; break;
			case 6: week = "金"; break;
			case 7: week = "土"; break;
		}
		
		System.out.println("誕生日は" + week + "曜日です");
	}
}





