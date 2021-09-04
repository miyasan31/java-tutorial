import java.io.*;

class sample12
{
	public static void main (String[]args) throws IOException
	{
		System.out.println("名古屋の天気は？");
		BufferedReader br1 =
			new BufferedReader(new InputStreamReader(System.in));
		String str1 = br1.readLine();
		
		
		System.out.println("東京の天気は？");
		BufferedReader br2 =
			new BufferedReader(new InputStreamReader(System.in));
		String str2 = br2.readLine();
		
		
		System.out.println("ニューヨークの天気は？");
		BufferedReader br3 =
			new BufferedReader(new InputStreamReader(System.in));
		String str3 = br3.readLine();		
		
		System.out.println("名古屋の天気は「" + str1 + "」です。");
		System.out.println("東京の天気は「" + str2 + "」です。");
		System.out.println("ニューヨークの天気は「" + str3 + "」です。" );
		
	}
}