import java.io.*;

public class kadai05_2{

	public static void main(String[] args) throws IOException{
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		
		System.out.println("生年月日の西暦を入力してください");
		str = br.readLine();
		int b_yy =Integer.parseInt(str);
		
		System.out.println("生年月日の月を入力してください");
		str = br.readLine();
		int b_mm =Integer.parseInt(str);
		
		System.out.println("生年月日の日を入力してください");
		str = br.readLine();
		int b_dd =Integer.parseInt(str);
		
		
		day_of_week obj1 = new day_of_week();
		int b_wk = obj1.youbi(b_yy, b_mm, b_dd);
		
		String week = "";
		switch(b_wk){
			case 1: week = "日"; break;
			case 2: week = "月"; break;
			case 3: week = "火"; break;
			case 4: week = "水"; break;
			case 5: week = "木"; break;
			case 6: week = "金"; break;
			case 7: week = "土"; break;
		}
		
		
		day_of_week obj2 = new day_of_week();
		int b_days = obj2.b_days(b_yy, b_mm, b_dd);
		
		
		day_of_week obj3 = new day_of_week();
		int wareki = obj3.wareki(b_yy, b_mm, b_dd);

		
		String nengou = "";
		switch(wareki){
			case 1: nengou = "令和"; break;
			case 2: nengou = "平成"; break;
			case 3: nengou = "昭和"; break;
			case 4: nengou = "大正"; break;
			case 5: nengou = "明治"; break;
		}
		
		
		day_of_week obj4 = new day_of_week();
		int wareki_yy = obj4.wareki_yy(b_yy, wareki);
		
		System.out.println("あなたは" + nengou + wareki_yy + "年" + b_mm + "月" + b_dd + "日（" + week + ")です");
		System.out.println("来年の誕生日まであと" + b_days + "日です");
	}
}





