import java.io.*;

class sample30
{
	public static void main (String[]args) throws IOException
	{
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		
		System.out.println("都道府県コードを入力してください");
		str = br.readLine();
		int num = Integer.parseInt(str);
		
		switch(num){
		case 1 :
			System.out.println("北海道");
			break;
		case 2 :
			System.out.println("青森県");
			break;
		case 3 :
			System.out.println("岩手県");
			break;
		case 4 :
			System.out.println("宮城県");
			break;
		case 5 :
			System.out.println("秋田県");
			break;
		case 6 :
			System.out.println("山形県");
			break;
		case 7 :
			System.out.println("福島県");
			break;
		case 8 :
			System.out.println("茨城県");
			break;
		case 9 :
			System.out.println("栃木県");
			break;
		case 10 :
			System.out.println("群馬県");
			break;
		case 11 :
			System.out.println("埼玉県");
			break;
		case 12 :
			System.out.println("千葉県");
			break;
		case 13 :
			System.out.println("東京都");
			break;
		case 14 :
			System.out.println("神奈川県");
			break;
		case 15 :
			System.out.println("新潟県");
			break;
		case 16 :
			System.out.println("富山県");
			break;
		case 17 :
			System.out.println("石川県");
			break;
		case 18 :
			System.out.println("福井県");
			break;
		case 19 :
			System.out.println("山梨県");
			break;
		case 20 :
			System.out.println("長野県");
			break;
		case 21 :
			System.out.println("岐阜県");
			break;
		case 22 :
			System.out.println("静岡県");
			break;
		case 23 :
			System.out.println("愛知県");
			break;
		case 24 :
			System.out.println("三重県");
			break;
		case 25 :
			System.out.println("滋賀県");
			break;
		case 26 :
			System.out.println("京都府");
			break;
		case 27 :
			System.out.println("大阪府");
			break;
		case 28 :
			System.out.println("兵庫県");
			break;
		case 29 :
			System.out.println("奈良県");
			break;
		case 30 :
			System.out.println("和歌山県");
			break;
		case 31 :
			System.out.println("鳥取県");
			break;
		case 32 :
			System.out.println("島根県");
			break;
		case 33 :
			System.out.println("岡山県");
			break;
		case 34 :
			System.out.println("広島県");
			break;
		case 35 :
			System.out.println("山口県");
			break;
		case 36 :
			System.out.println("徳島県");
			break;
		case 37 :
			System.out.println("香川県");
			break;
		case 38 :
			System.out.println("愛媛県");
			break;
		case 39 :
			System.out.println("高知県");
			break;
		case 40 :
			System.out.println("福岡県");
			break;
		case 41 :
			System.out.println("佐賀県");
			break;
		case 42 :
			System.out.println("長崎県");
			break;
		case 43 :
			System.out.println("熊本県");
			break;
		case 44 :
			System.out.println("大分県");
			break;
		case 45 :
			System.out.println("宮崎県");
			break;
		case 46 :
			System.out.println("鹿児島県");
			break;
		case 47 :
			System.out.println("沖縄県");
			break;
		default :
			System.out.println("該当する都道府県はありません");
			break;
		}
		
	}
}