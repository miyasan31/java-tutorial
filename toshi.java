
import java.util.Date;
import java.util.Calendar;

class toshi{
	int nenrei(int a, int b,int c){
		
		Date today = new Date(); //���ݎ����擾
		
		Calendar cal = Calendar.getInstance(); //Calendar�N���X�I�u�W�F�N�g�쐬
		
		cal.setTime(today); //���ݓ��t�ݒ�
	
		int yy = cal.get(Calendar.YEAR); //�N�̎擾
		int mm = cal.get(Calendar.MONTH) + 1; //���̎擾�i�O���P���j
		int dd = cal.get(Calendar.DATE); //���̎擾
		int hh = cal.get(Calendar.HOUR_OF_DAY); //���̎擾
		int mi = cal.get(Calendar.MINUTE); //���̎擾
		int ss = cal.get(Calendar.SECOND); //�b�̎擾
		
		int age = yy - a;
		
		if(mm < b){
			age = age - 1;
		}
		else if(mm == b && dd < c){
			age = age - 1;
		}
		
		return age;
	}
	
}
