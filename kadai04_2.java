import java.io.*;

public class kadai04_2
{
	public static void main (String[]args) throws IOException
	{

		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		String str1 = "";
		int j1 = 0;
		
		System.out.println("開始月を入力してください");
		str = br.readLine();
		int m1 = Integer.parseInt(str);
		
		if(!( m1 >= 1 && m1 <= 12 )){
			System.out.println("正しい数値を入力してください");
			return;
		}
		
		System.out.println("終了月を入力してください");
		str = br.readLine();
		int m2 = Integer.parseInt(str);
		
		if(!( m2 >= 1 && m2 <= 12 && m2 > m1 )){
			System.out.println("正しい数値を入力してください");
			return;
		}
		
		
		for(int m = m1; m != m2 + 1 ; m++){
			
			switch(m){
			case  1:
			case  3:
			case  5:
			case  7:
			case  8:
			case 10:
			case 12:
				j1 = 31;
				break;
			case  4:
			case  6:
			case  9:
			case 11:
				j1 = 30;
				break;
			case  2:
				j1 = 28;
				break;
			}
			
			System.out.println("\n" + m + "月カレンダー");
			
			for(int i = 1; i <= j1; i++){
				
				switch(m){
				case  1:
					if(i==1){
					str1 = "元旦";
					}
					else if(i==13){
					str1 = "成人";
					}
					break;
				case  3:
					if(i==20){
					str1 = "春分";
					}
					break;
				case  5:
					if(i==3){
					str1 = "憲法";
					}
					else if(i==4){
					str1 = "みどり";
					}
					else if(i==5){
					str1 = "子ども";
					}
					break;
				case  7:
					if(i==23){
					str1 = "海";
					}
					else if(i==24){
					str1 = "体育";
					}
					break;
				case  8:
					if(i==11){
					str1 = "山";
					}
					break;
				case 10:
				case 12:
					break;
				case  4:
					if(i==29){
					str1 = "昭和";
					}
					break;
				case  6:
					break;
				case  9:
					if(i==21){
					str1 = "敬老";
					}
					else if(i==22){
					str1 = "秋分";
					}
					break;
				case 11:
					if(i==3){
					str1 = "文化";
					}
					else if(i==23){
					str1 = "勤労";
					}
					break;
				case  2:
					if(i==11){
					str1 = "建国";
					}
					else if(i==23){
					str1 = "天皇";
					}
					break;
				}
				
				if(m==5 && i==4){
					System.out.print(" " + i + str1);
				}
				else if(m==5 && i==5){
					System.out.print(" " + i + str1);
				}
				else if(((i%7) == 0) && i < 10){
					System.out.print(" " + i + str1 +"\t");
					System.out.print("\n");
				}
				else if((i%7) == 0){
					System.out.print( i + str1 +"\t");
					System.out.print("\n");
				}
				else if(i < 10){
					System.out.print(" "+ i + str1 + "\t");
				}
				else{
					System.out.print( i + str1 + "\t");
				}
				
				str1 = "";
			}
		System.out.print("\n");
		}
	}
}