import java.io.*;

class kadai03
{
	public static void main (String[]args) throws IOException
	{
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";

		System.out.println("午前得点を入力してください");
		str = br.readLine();
		int num1 = Integer.parseInt(str);
		
		if(!(num1>=0 && num1<=100)){
			System.out.println("エラー");
			return;
		}

		System.out.println("午後得点を入力してください");
		str = br.readLine();
		int num2 = Integer.parseInt(str);
		
		if(!(num2>=0 && num2<=100)){
			System.out.println("エラー");
			return;
		}

		
		int num3 = num1 + num2;
		
		System.out.println("************************************");
		System.out.println("国家試験判定");
		System.out.println("午前：" + num1 + "点");
		System.out.println("午後：" + num2 + "点");
		System.out.println("合計：" + num3 + "点");
		
		if(num1>=65 && num2>=65 && num3>=140){
			System.out.println("判定：合格");
		}
		else{
			System.out.println("判定：不合格");
		}
		
		System.out.println("************************************");

	}
}