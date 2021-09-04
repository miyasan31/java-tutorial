import java.io.*;

class sample32
{
	public static void main (String[]args) throws IOException
	{
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		
		System.out.println("メニューを選択してください");
		System.out.println("コーヒー（\\350）		:１");
		System.out.println("ミルクティー（\\350）		:２");
		System.out.println("レモンティー（\\350）		:３");
		System.out.println("コーラ（\\400）			:４");
		System.out.println("ココア（\\400）			:５");
		System.out.println("カフェラテ（\\450）		:６");
		
		str = br.readLine();
		int num1 = Integer.parseInt(str);
		
		if( num1 >= 1 && num1 <= 6){
			
			System.out.println("注文数を入力してください");
			str = br.readLine();
			int num2 = Integer.parseInt(str);
		
			if( num1 == 1 || num1 == 2 || num1 == 3){
				System.out.println("料金は" + (350 * num2 ) + "円です");
			}
			else if( num1 == 4 || num1 == 5){
				System.out.println("料金は" + (400 * num2 ) + "円です");
			}
			else if( num1 == 6 ){
				System.out.println("料金は" + (450 * num2 ) + "円です");
			}
		}
		else{
			System.out.println("メニューが間違っています");
		}
		
	}
}