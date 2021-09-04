import java.io.*;

public class kadai07{

	public static void main(String[] args) throws IOException{
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		
		System.out.println("西暦を入力してください");
		str = br.readLine();
		int yy =Integer.parseInt(str);
				
		System.out.println("月を入力してください");
		str = br.readLine();
		int mm =Integer.parseInt(str);
		
		
		day_of_week obj1 = new day_of_week();
		int wk = obj1.youbi(yy, mm, 1); //○月１日の曜日を取得
		
		int max_dd = 31;
		
		switch(mm){
			case  4:
			case  6:
			case  9:
			case 11:
				max_dd = 30;
				break;
			case  2:
				leap_year obj2 = new leap_year();
				max_dd = obj2.uruudosi(yy); 
				break;
		}
		
		int cnt_dd = 1; //カウンター定義
		
		int cal_tbl[][]  = new int[6][7];
		
		for(int i = 0; i < 6; i++){
			for(int j = 0; j < 7; j++){
				cal_tbl[i][j] = 0;
			}	
		}
		
		for(int i = 0; i < 6; i++){
			for(int j = 0; j < 7; j++){
				if(i == 0){
					if(j > wk-1){
						cal_tbl[i][j] = cnt_dd;
						cnt_dd++;
					}
				}
				else if(cnt_dd <= max_dd){
					cal_tbl[i][j] = cnt_dd;
					cnt_dd++;
				}
			}	
		}
		
	
		
		System.out.println("\t" + yy  + "年" + mm + "月カレンダー");
		System.out.println("------------------------------------");
		System.out.println("|"+" "+"日"+" "+"|"+" "+"月"+" "+"|"+" "+"火"+" "+"|"+" "+"水"+" "+"|"+" "+"木"+" "+"|"+" "+"金"+" "+"|"+" "+"土"+" "+"|");
		System.out.println("------------------------------------");

		for(int i = 0; i < 6; i++){
			for(int j = 0; j < 7; j++){
				if(cal_tbl[i][j] == 0){
					System.out.print("|"+"    ");
				}
				else if(cal_tbl[i][j] < 10){
					System.out.print("|"+"  "+cal_tbl[i][j]+" ");
				}
				else{
					System.out.print("|"+" "+cal_tbl[i][j]+" ");
				}
			}	
			System.out.println("|");
			System.out.println("------------------------------------");
		}

		
	}
}
