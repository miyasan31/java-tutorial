import java.io.*;

class sample21
{
	public static void main (String[]args) throws IOException
	{
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		
		System.out.println("年齢を入力してください");
		str = br.readLine();
		int num =Integer.parseInt(str);
		
		if(num >= 20){ //20歳以上ならば下の処理が実行される
			System.out.println("20歳以上です");
		}
		else{
			System.out.println("20歳未満です");
		}
	}
}