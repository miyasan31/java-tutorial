/*
ƒe[ƒ}:ƒIƒvƒVƒ‡ƒ“1 Œ»‹ào”[’ 
§ìÒ:PI11A172_29_‹{Œ´«‘¾
§ì“ú:2020.06.03
*/

import java.io.*;

class kadai02_1
{
	public static void main (String[]args) throws IOException
	{
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		
		System.out.println("¡Œ‚Ìû“ü‹àŠz‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		str = br.readLine();
		int num1 = Integer.parseInt(str);
		
		System.out.println("æŒ‚ÌŒJ‰z‹àŠz‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		str = br.readLine();
		int num2 = Integer.parseInt(str);
		
		System.out.println("‚P“ú‚Ì•½‹ÏxoŠz‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		str = br.readLine();
		int num3 = Integer.parseInt(str);
		
		
		
		System.out.println("*****************************");
		
		System.out.println("Œ»‹ào”[’ ");
		
		System.out.println("¡Œ‚Ìg—p‰Â”\‹àŠz‚Í:" + (num1 + num2) + "‰~");
		System.out.println("‚P“ú‚Ìg—p‰Â”\‹àŠz‚Í:" + ((num1 + num2) / 30) + "‰~");
		System.out.println("¡Œ‚Ìxo—\‘z‹àŠz‚Í:" + (num3 * 30) + "‰~");
		System.out.println("¡Œ‚ÌŒJ‰z—\‘z‹àŠz‚Í:" + ((num1 + num2) - (num3 * 30)) + "‰~");
		
		System.out.println("*****************************");
		
	}
}