/*
テーマ:オプション1 現金出納帳
制作者:PI11A172_29_宮原将太
制作日:2020.06.03
*/

import java.io.*;

class kadai02_1
{
	public static void main (String[]args) throws IOException
	{
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		
		System.out.println("今月の収入金額を入力してください");
		str = br.readLine();
		int num1 = Integer.parseInt(str);
		
		System.out.println("先月の繰越金額を入力してください");
		str = br.readLine();
		int num2 = Integer.parseInt(str);
		
		System.out.println("１日の平均支出額を入力してください");
		str = br.readLine();
		int num3 = Integer.parseInt(str);
		
		
		
		System.out.println("*****************************");
		
		System.out.println("現金出納帳");
		
		System.out.println("今月の使用可能金額は:" + (num1 + num2) + "円");
		System.out.println("１日の使用可能金額は:" + ((num1 + num2) / 30) + "円");
		System.out.println("今月の支出予想金額は:" + (num3 * 30) + "円");
		System.out.println("今月の繰越予想金額は:" + ((num1 + num2) - (num3 * 30)) + "円");
		
		System.out.println("*****************************");
		
	}
}