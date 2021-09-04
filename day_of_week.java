import java.util.Date;
import java.util.Calendar;

class day_of_week{
	int youbi(int set_yy, int set_mm,int set_dd){
		
		Date today = new Date(); //現在時刻取得
		
		Calendar cal = Calendar.getInstance(); //Calendarクラスオブジェクト作成
		
		cal.setTime(today); //現在日付設定
	
		cal.set(Calendar.YEAR,set_yy); 
		cal.set(Calendar.MONTH,set_mm-1); 
		cal.set(Calendar.DATE,set_dd); 
		
		int wk = cal.get(Calendar.DAY_OF_WEEK);
		return wk = wk-1;
	}
	
	
	
	int b_days(int set_yy, int set_mm, int set_dd){
		
		Date today = new Date(); //現在時刻取得
		
		Calendar cal = Calendar.getInstance(); //Calendarクラスオブジェクト作成
		
		cal.setTime(today); //現在日付設定
		
		int get_yy = cal.get(Calendar.YEAR); 
		int get_mm = cal.get(Calendar.MONTH); 
		int get_dd = cal.get(Calendar.DATE); 
		cal.set(Calendar.YEAR,get_yy); 
		cal.set(Calendar.MONTH,get_mm); 
		cal.set(Calendar.DATE,get_dd); 
		
		int a_days = cal.get(Calendar.DAY_OF_YEAR);
		
		
		int get_yy_1 = cal.get(Calendar.YEAR + 1); 
		cal.set(Calendar.YEAR,get_yy_1); 
		cal.set(Calendar.MONTH,set_mm-1); 
		cal.set(Calendar.DATE,set_dd); 
		
		int b_days = cal.get(Calendar.DAY_OF_YEAR);
		
		int c_days = b_days + (365 - a_days);
		
		return c_days;
	}
	
	int  wareki(int yy, int mm, int dd){
		int nengou
		int nitireki = (yy * 10000) + (mm * 100) + dd;
		
		if(nitireki >= 20190501){
			nengou = 1; 
		}
		else if(nitireki >= 19890108){
			nengou = 2; 
		}
		else if(nitireki >= 19261225){
			nengou = 3; 
		}
		else if(nitireki >= 19120730){
			nengou = 4; 
		}
		else{
			nengou = 5; 
		}
		
		return nengou;
	}
;
		
	int  wareki_yy(int b_yy, int nengou){
		
		int nengou_yy = 0;
		
		switch(nengou){
		case 1:
			nengou_yy = b_yy - 2019;
			break;
		case 2:
			nengou_yy = b_yy - 1989;
			break;
		case 3:
			nengou_yy = b_yy - 1926;
			break;
		case 4:
			nengou_yy = b_yy - 1912;
			break;
		case 5:
			nengou_yy = b_yy - 1868;
			break;
		}
		
		int nengou1 = nengou_yy + 1;
		
		return nengou1;
	}
	
}




