import java.util.Date;
import java.util.Calendar;

public class sample71{

	public static void main(String[] args){
		
		Date today = new Date(); //���ݎ����擾
		
		Calendar cal = Calendar.getInstance(); //Calendar�N���X�I�u�W�F�N�g�쐬
		
		cal.setTime(today); //���ݓ��t�ݒ�
	
		int yy = cal.get(Calendar.YEAR); //�N�̎擾
		int mm = cal.get(Calendar.MONTH) + 1; //���̎擾�i�O���P���j
		int dd = cal.get(Calendar.DATE); //���̎擾
		int hh = cal.get(Calendar.HOUR_OF_DAY); //���̎擾
		int mi = cal.get(Calendar.MINUTE); //���̎擾
		int ss = cal.get(Calendar.SECOND); //�b�̎擾
		int wk = cal.get(Calendar.DAY_OF_WEEK); //
		
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
		
		System.out.println(yy + "�N" + mm + "��" + dd + "��(" + week + ")" + hh + ":" + mi + ":" + ss);
	}
}





