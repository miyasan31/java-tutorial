import java.io.*;

public class kadai05{

	public static void main(String[] args) throws IOException{
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		
		System.out.println("���N�����̐������͂��Ă�������");
		str = br.readLine();
		int b_yy =Integer.parseInt(str);
		
		System.out.println("���N�����̌�����͂��Ă�������");
		str = br.readLine();
		int b_mm =Integer.parseInt(str);
		
		System.out.println("���N�����̓�����͂��Ă�������");
		str = br.readLine();
		int b_dd =Integer.parseInt(str);
		
		
		day_of_week obj = new day_of_week();
		int b_wk = obj.youbi(b_yy, b_mm, b_dd);
		
		String week = "";
		switch(b_wk){
			case 1: week = "��"; break;
			case 2: week = "��"; break;
			case 3: week = "��"; break;
			case 4: week = "��"; break;
			case 5: week = "��"; break;
			case 6: week = "��"; break;
			case 7: week = "�y"; break;
		}
		
		System.out.println("���Ȃ���" + week + "�j�����܂�ł�");
	}
}





