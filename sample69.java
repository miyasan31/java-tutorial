import java.io.*;
import java.util.Date;
import java.util.Calendar;

public class sample69{

	public static void main(String[] args) throws IOException{
		

		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		
		System.out.println("誕生日の西暦を入力してください");
		str = br.readLine();
		int num1 =Integer.parseInt(str);
		
		System.out.println("誕生日の月を入力してください");
		str = br.readLine();
		int num2 =Integer.parseInt(str);
		
		System.out.println("誕生日の日を入力してください");
		str = br.readLine();
		int num3 =Integer.parseInt(str);
		
		Date today = new Date(); //現在時刻取得
		
		Calendar cal = Calendar.getInstance(); //Calendarクラスオブジェクト作成
		
		cal.setTime(today); //現在日付設定
	
		int yy = cal.get(Calendar.YEAR); //年の取得
		int mm = cal.get(Calendar.MONTH) + 1; //月の取得（０→１月）
		int dd = cal.get(Calendar.DATE); //日の取得
		int hh = cal.get(Calendar.HOUR_OF_DAY); //時の取得
		int mi = cal.get(Calendar.MINUTE); //分の取得
		int ss = cal.get(Calendar.SECOND); //秒の取得
		
		int age = yy - num1;
		
		if(mm > num2){
			System.out.println(age + "才です");
		}
		else if(mm < num2){
			System.out.println((age-1) + "才です");
		}
		else if(mm == num2){
			if(dd >= num3){
				System.out.println(age + "才です");
			}
			else if(dd < num3){
				System.out.println((age-1) + "才です");	
			}
		}
	}
}





