import java.io.*;

class sample22
{
	public static void main (String[]args) throws IOException
	{
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		
		System.out.println("年齢を入力してください");
		str = br.readLine();
		int num =Integer.parseInt(str);
		
		if(num >= 20){
			System.out.println("20歳以上です");
		}
		else if(num >= 10){
			System.out.println("10〜19歳です");
		}
		else{
			System.out.println("10歳未満です");
		}
	}
}