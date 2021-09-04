import java.io.*;

class kadai01_1
{
	public static void main (String[]args) throws IOException
	{
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("氏名は？");
		String str1 = br.readLine();
		
		System.out.println("年齢は？");
		String str2 = br.readLine();
		
		System.out.println("趣味は？");
		String str3 = br.readLine();		
		
		System.out.println("出身地は？");
		String str4 = br.readLine();
		
		System.out.println("何かコメントはありますか？");
		String str5 = br.readLine();
		
		System.out.println("私はの氏名は「" + str1 + "」です。");
		System.out.println("年齢は「" + str2 + "」です。");
		System.out.println("趣味として「" + str3 + "」をやっています。" );
		System.out.println("「" + str4 + "」からやって参りました。");
		System.out.println("最後に一言・・・「" + str5 + "」。");		
		
		
	}
}