import java.io.*;

class sample24
{
	public static void main (String[]args) throws IOException
	{
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		
		System.out.println("年齢を入力してください");
		str = br.readLine();
		int num =Integer.parseInt(str);
		
		if(num >= 50){
			System.out.println("50歳以上です");
		}
		else if(num >= 40){
			System.out.println("40代です");
		}
		else if(num >= 30){
			System.out.println("30代です");
		}
		else if(num >= 20){
			System.out.println("20代です");
		}
		else if(num >= 10){
			System.out.println("10代です");
		}
		else{
			System.out.println("10歳未満です");
		}

	}
}