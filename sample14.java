import java.io.*;

class sample14
{
	public static void main (String[]args) throws IOException
	{
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		
		System.out.println("数値1を入力してください");
		str = br.readLine();
		int num1 =Integer.parseInt(str);
		
		System.out.println("数値2を入力してください");
		str = br.readLine();
		int num2 =Integer.parseInt(str);
		
		int ans =num1 * num2;
		System.out.println("合計は" + ans);
		
		
	}
}