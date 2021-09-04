import java.io.*;

public class kadai04
{
	public static void main (String[]args) throws IOException
	{

		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		int j1 = 0;
		
		System.out.println("出力する月を入力してください");
		str = br.readLine();
		int m = Integer.parseInt(str);

		if(!( m >= 1 && m <= 12 )){
			System.out.println("正しい数値を入力してください");
			return;
		}	
		
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
			if(((i%7) == 0) && i < 10){
				System.out.print(" " + i + "\t");
				System.out.print("\n");
			}
			else if((i%7) == 0){
				System.out.print( i + "\t");
				System.out.print("\n");
			}
			else if(i < 10){
				System.out.print(" "+ i + "\t");
			}
			else{
				System.out.print( i + "\t");
			}
		}
	}
}