
import java.util.Date;
import java.util.Calendar;

class toshi{
	int nenrei(int a, int b,int c){
		
		Date today = new Date(); //現在時刻取得
		
		Calendar cal = Calendar.getInstance(); //Calendarクラスオブジェクト作成
		
		cal.setTime(today); //現在日付設定
	
		int yy = cal.get(Calendar.YEAR); //年の取得
		int mm = cal.get(Calendar.MONTH) + 1; //月の取得（０→１月）
		int dd = cal.get(Calendar.DATE); //日の取得
		int hh = cal.get(Calendar.HOUR_OF_DAY); //時の取得
		int mi = cal.get(Calendar.MINUTE); //分の取得
		int ss = cal.get(Calendar.SECOND); //秒の取得
		
		int age = yy - a;
		
		if(mm < b){
			age = age - 1;
		}
		else if(mm == b && dd < c){
			age = age - 1;
		}
		
		return age;
	}
	
}
