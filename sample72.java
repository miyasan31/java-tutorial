import java.util.Date;
import java.util.Calendar;

public class sample72{

	public static void main(String[] args){
		
		Date today = new Date(); //���ݎ����擾
		
		Calendar cal = Calendar.getInstance(); //Calendar�N���X�I�u�W�F�N�g�쐬
		
		cal.setTime(today); //���ݓ��t�ݒ�
	
		int set_yy = 2020; 
		int set_mm = 9;
		int set_dd = 10;
		cal.set(Calendar.YEAR,set_yy); 
		cal.set(Calendar.MONTH,set_mm-1); 
		cal.set(Calendar.DATE,set_dd); 
		
		int wk = cal.get(Calendar.DAY_OF_WEEK);
		String week = "";
		
		switch(wk){
			case 1: week = "��"; break;
			case 2: week = "��"; break;
			case 3: week = "��"; break;
			case 4: week = "��"; break;
			case 5: week = "��"; break;
			case 6: week = "��"; break;
			case 7: week = "�y"; break;
		}
		
		System.out.println(set_yy + "�N" + set_mm + "��" + set_dd + "����" + week + "�j���ł�");
	}
}





