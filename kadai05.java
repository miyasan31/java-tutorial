import java.io.*;

public class kadai05{

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
		
		
		day_of_week obj = new day_of_week();
		int b_wk = obj.youbi(b_yy, b_mm, b_dd);
		
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
		
		System.out.println("あなたは" + week + "曜日生まれです");
	}
}





