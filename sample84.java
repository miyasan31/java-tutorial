import java.io.*;
import java.util.Date;
import java.util.Calendar;

public class sample84{

	public static void main(String[] args) throws IOException{
		
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		
		System.out.println("�e�X�g�̎󌱎Ґ�����͂��Ă�������");
		
		str = br.readLine();
		int num = Integer.parseInt(str);
		
		int[] test;
		test = new int[num];
		
		System.out.println("�l�����̓_������͂��Ă�������");
		
		for(int i = 0; i < test.length; i++){
			
			str = br.readLine();
			int tmp = Integer.parseInt(str);
			test[i] = tmp;
		}
		
		int j = 0;
		
		for(int i = 0; i < num; i++){
			
			System.out.println((i + 1) + "�Ԗڂ̐l�̓_����" + test[i] + "�ł��B");
			j = j + test[i];
		
		}
		
		System.out.println("���v�_���F" + j + "�_");
		
	}
}





