import java.io.*;

public class kadai05_2{

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
		
		
		day_of_week obj1 = new day_of_week();
		int b_wk = obj1.youbi(b_yy, b_mm, b_dd);
		
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
		
		
		day_of_week obj2 = new day_of_week();
		int b_days = obj2.b_days(b_yy, b_mm, b_dd);
		
		
		day_of_week obj3 = new day_of_week();
		int wareki = obj3.wareki(b_yy, b_mm, b_dd);

		
		String nengou = "";
		switch(wareki){
			case 1: nengou = "�ߘa"; break;
			case 2: nengou = "����"; break;
			case 3: nengou = "���a"; break;
			case 4: nengou = "�吳"; break;
			case 5: nengou = "����"; break;
		}
		
		
		day_of_week obj4 = new day_of_week();
		int wareki_yy = obj4.wareki_yy(b_yy, wareki);
		
		System.out.println("���Ȃ���" + nengou + wareki_yy + "�N" + b_mm + "��" + b_dd + "���i" + week + ")�ł�");
		System.out.println("���N�̒a�����܂ł���" + b_days + "���ł�");
	}
}





