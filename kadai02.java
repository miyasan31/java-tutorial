/*
テーマ:四則演算プログラム
制作者:PI11A172_29_宮原将太
制作日:2020.06.03
*/

import java.io.*;

class kadai02
{
	public static void main (String[]args) throws IOException
	{
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		String str = " ";
		
		System.out.println("数値1を入力してください");
		str = br.readLine();
		int num1 = Integer.parseInt(str);
		
		System.out.println("数値2を入力してください");
		str = br.readLine();
		int num2 = Integer.parseInt(str);
		
		System.out.println("***********");
		
		System.out.println( num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.println( num1 + " - " + num2 + " = " + (num1 - num2));
		System.out.println( num1 + " * " + num2 + " = " + (num1 * num2));
		System.out.println( num1 + " / " + num2 + " = " + (num1 / num2) + " … " + (num1 % num2));
		
		System.out.println("***********");
		
	}
}