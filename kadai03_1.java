import java.io.*;

public class kadai03_1
{
	public static void main (String[]args) throws IOException
	{
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		String str1 = "";
//***********************************************************************************************************
		
		System.out.println("クラス記号を入力してください");
		str1 = br.readLine();
		
		if(!(str1.equals("PI11A172")||str1.equals("PW11A172"))){
			System.out.println("エラー");
			return;
		}	
//***********************************************************************************************************
		
		System.out.println("出席番号を入力してください");
		str = br.readLine();
		int num4 = Integer.parseInt(str);
		
		if(str1.equals("PI11A172")){
			if(!(num4>=1 && num4<=5)){
				System.out.println("エラー");
				return;
			}
		}
//***********************************************************************************************************
		
		else if(str1.equals("PW11A172")){
			if(!(num4>=1 && num4<=4)){
				System.out.println("エラー");
				return;
			}
		}
//***********************************************************************************************************

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
//***********************************************************************************************************
		
		System.out.println("************************************");
		System.out.println("国家試験判定");
		System.out.println("クラス記号：" + str1);		
		System.out.println("出席番号：" + num4);
		
		if(str1.equals("PI11A172")){
			switch(num4){
			case 1:
				System.out.println("氏名：朝倉　加奈子");
				break;
			case 2:
				System.out.println("氏名：荒木　浩司");
				break;
			case 3:
				System.out.println("氏名：池田　光紀");
				break;
			case 4:
				System.out.println("氏名：臼井　洋輔");
				break;
			case 5:
				System.out.println("氏名：大野　良太");
				break;
			}
		}
		
		else if(str1.equals("PW11A172")){
			switch(num4){
			case 1:
				System.out.println("氏名：石川　宏喜");
				break;
			case 2:
				System.out.println("氏名：伊藤　直也");
				break;
			case 3:
				System.out.println("氏名：岩川　直樹");
				break;
			case 4:
				System.out.println("氏名：奥村　和也");
				break;
			}		
		}
		
		
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