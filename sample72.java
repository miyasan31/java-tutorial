import java.util.Date;
import java.util.Calendar;

public class sample72{

	public static void main(String[] args){
		
		Date today = new Date(); //現在時刻取得
		
		Calendar cal = Calendar.getInstance(); //Calendarクラスオブジェクト作成
		
		cal.setTime(today); //現在日付設定
	
		int set_yy = 2020; 
		int set_mm = 9;
		int set_dd = 10;
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
		
		System.out.println(set_yy + "年" + set_mm + "月" + set_dd + "日は" + week + "曜日です");
	}
}





