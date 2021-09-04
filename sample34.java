import java.io.*;

class sample34
{
	public static void main (String[]args) throws IOException
	{
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";

		System.out.println("月を入力してください");
		str = br.readLine();
		int num = Integer.parseInt(str);

		if( !(num >= 1 && num <= 12)){
			System.out.println("月が間違っています");
			return;
		}	
			
			switch(num){
				case 6:
				case 12:
					System.out.println("祭日はありません");
					break;
				
				case 1:
					System.out.println("1月1日：元旦");
					System.out.println("1月13日：成人の日");
					break;
				case 2:
					System.out.println("2月11日：建国記念の日");
					System.out.println("2月23日：天皇誕生日");
					break;
				case 3:
					System.out.println("3月20日：春分の日" );
					break;
				case 4:
					System.out.println("4月29日：昭和の日");
					break;
				case 5:
					System.out.println("5月3日：憲法記念の日");
					System.out.println("5月4日：みどりの日");
					System.out.println("5月5日:こどもの日");
					break;
				case 7:
					System.out.println("7月23日：海の日");
					System.out.println("7月24日：スポーツの日");
					break;
				case 8:
					System.out.println("8月11日：山の日");
					break;
				case 9:
					System.out.println("9月21日：敬老");
					System.out.println("9月22日：秋分の日");
					break;
				case 11:
					System.out.println("11月3日:スポーツの日");
					System.out.println("11月23日：敬老感謝の日");
					break;
			}
		
	}
}