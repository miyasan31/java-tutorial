import java.io.*;

class sample29
{
	public static void main (String[]args) throws IOException
	{
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		
		System.out.println("文字を入力してください");
		str = br.readLine();
		
		switch(str){
		case "あいうえお" :
			System.out.println(str + "が入力されました");
			break;
		case "かきくけこ" :
			System.out.println(str + "が入力されました");
			break;
		default :
			System.out.println("入力が間違っています");
			break;
		}
		
	}
}