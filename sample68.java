
import java.util.Date;
import java.util.Calendar;

public class sample68{

	public static void main(String[] args){
		
		Date today = new Date(); //���ݎ����擾
		
		Calendar cal = Calendar.getInstance(); //Calendar�N���X�I�u�W�F�N�g�쐬
		
		cal.setTime(today); //���ݓ��t�ݒ�
	
		int yy = cal.get(Calendar.YEAR); //�N�̎擾
		int mm = cal.get(Calendar.MONTH) + 1; //���̎擾
		int dd = cal.get(Calendar.DATE); //���̎擾
		int hh = cal.get(Calendar.HOUR_OF_DAY); //���̎擾
		int mi = cal.get(Calendar.MINUTE); //���̎擾
		int ss = cal.get(Calendar.SECOND); //�b�̎擾
		
		System.out.println(yy + "�N" + mm + "��" + dd + "��" + hh + "�F" + mi + "�F" + ss);
		
	}
}

