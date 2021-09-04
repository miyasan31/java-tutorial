import java.io.*;

class sample26
{
	public static void main (String[]args) throws IOException
	{
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		String str = "";

		System.out.println("年齢を入力してください");
		str = br.readLine();
		int num1 =Integer.parseInt(str);
		
		System.out.println("性別を入力してください（男性：1 女性：2）");
		str = br.readLine();
		int num2 =Integer.parseInt(str);
		
		if(num1 >= 20 && num2 == 2 ){
			if(num2 == 2){
			System.out.println("料金は1000円です");
			}
		}
		else{
			System.out.println("料金は1500円です");
		}

	}
}