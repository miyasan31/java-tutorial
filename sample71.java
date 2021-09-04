import java.util.Date;
import java.util.Calendar;

public class sample71{

	public static void main(String[] args){
		
		Date today = new Date(); //現在時刻取得
		
		Calendar cal = Calendar.getInstance(); //Calendarクラスオブジェクト作成
		
		cal.setTime(today); //現在日付設定
	
		int yy = cal.get(Calendar.YEAR); //年の取得
		int mm = cal.get(Calendar.MONTH) + 1; //月の取得（０→１月）
		int dd = cal.get(Calendar.DATE); //日の取得
		int hh = cal.get(Calendar.HOUR_OF_DAY); //時の取得
		int mi = cal.get(Calendar.MINUTE); //分の取得
		int ss = cal.get(Calendar.SECOND); //秒の取得
		int wk = cal.get(Calendar.DAY_OF_WEEK); //
		
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
		
		System.out.println(yy + "年" + mm + "月" + dd + "日(" + week + ")" + hh + ":" + mi + ":" + ss);
	}
}





