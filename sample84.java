import java.io.*;
import java.util.Date;
import java.util.Calendar;

public class sample84{

	public static void main(String[] args) throws IOException{
		
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		
		System.out.println("テストの受験者数を入力してください");
		
		str = br.readLine();
		int num = Integer.parseInt(str);
		
		int[] test;
		test = new int[num];
		
		System.out.println("人数分の点数を入力してください");
		
		for(int i = 0; i < test.length; i++){
			
			str = br.readLine();
			int tmp = Integer.parseInt(str);
			test[i] = tmp;
		}
		
		int j = 0;
		
		for(int i = 0; i < num; i++){
			
			System.out.println((i + 1) + "番目の人の点数は" + test[i] + "です。");
			j = j + test[i];
		
		}
		
		System.out.println("合計点数：" + j + "点");
		
	}
}





