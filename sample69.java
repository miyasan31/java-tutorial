import java.io.*;
import java.util.Date;
import java.util.Calendar;

public class sample69{

	public static void main(String[] args) throws IOException{
		

		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		
		System.out.println("�a�����̐������͂��Ă�������");
		str = br.readLine();
		int num1 =Integer.parseInt(str);
		
		System.out.println("�a�����̌�����͂��Ă�������");
		str = br.readLine();
		int num2 =Integer.parseInt(str);
		
		System.out.println("�a�����̓�����͂��Ă�������");
		str = br.readLine();
		int num3 =Integer.parseInt(str);
		
		Date today = new Date(); //���ݎ����擾
		
		Calendar cal = Calendar.getInstance(); //Calendar�N���X�I�u�W�F�N�g�쐬
		
		cal.setTime(today); //���ݓ��t�ݒ�
	
		int yy = cal.get(Calendar.YEAR); //�N�̎擾
		int mm = cal.get(Calendar.MONTH) + 1; //���̎擾�i�O���P���j
		int dd = cal.get(Calendar.DATE); //���̎擾
		int hh = cal.get(Calendar.HOUR_OF_DAY); //���̎擾
		int mi = cal.get(Calendar.MINUTE); //���̎擾
		int ss = cal.get(Calendar.SECOND); //�b�̎擾
		
		int age = yy - num1;
		
		if(mm > num2){
			System.out.println(age + "�˂ł�");
		}
		else if(mm < num2){
			System.out.println((age-1) + "�˂ł�");
		}
		else if(mm == num2){
			if(dd >= num3){
				System.out.println(age + "�˂ł�");
			}
			else if(dd < num3){
				System.out.println((age-1) + "�˂ł�");	
			}
		}
	}
}





