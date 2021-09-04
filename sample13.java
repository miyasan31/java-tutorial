import java.io.*;

class sample13
{
	public static void main (String[]args) throws IOException
	{
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("名古屋の天気は？");
		String str1 = br.readLine();
		
		System.out.println("東京の天気は？");
		String str2 = br.readLine();
		
		System.out.println("ニューヨークの天気は？");
		String str3 = br.readLine();		
		
		
		System.out.println("名古屋の天気は「" + str1 + "」です。");
		System.out.println("東京の天気は「" + str2 + "」です。");
		System.out.println("ニューヨークの天気は「" + str3 + "」です。" );
		
	}
}