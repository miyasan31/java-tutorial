import java.io.*;

public class sample70{

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
		
		toshi obj = new toshi();
		int age = obj.nenrei(b_yy, b_mm, b_dd);
		System.out.println(age + "才です");

	}
}





