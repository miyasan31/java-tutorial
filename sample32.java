import java.io.*;

class sample32
{
	public static void main (String[]args) throws IOException
	{
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		
		System.out.println("���j���[��I�����Ă�������");
		System.out.println("�R�[�q�[�i\\350�j		:�P");
		System.out.println("�~���N�e�B�[�i\\350�j		:�Q");
		System.out.println("�������e�B�[�i\\350�j		:�R");
		System.out.println("�R�[���i\\400�j			:�S");
		System.out.println("�R�R�A�i\\400�j			:�T");
		System.out.println("�J�t�F���e�i\\450�j		:�U");
		
		str = br.readLine();
		int num1 = Integer.parseInt(str);
		
		if( num1 >= 1 && num1 <= 6){
			
			System.out.println("����������͂��Ă�������");
			str = br.readLine();
			int num2 = Integer.parseInt(str);
		
			if( num1 == 1 || num1 == 2 || num1 == 3){
				System.out.println("������" + (350 * num2 ) + "�~�ł�");
			}
			else if( num1 == 4 || num1 == 5){
				System.out.println("������" + (400 * num2 ) + "�~�ł�");
			}
			else if( num1 == 6 ){
				System.out.println("������" + (450 * num2 ) + "�~�ł�");
			}
		}
		else{
			System.out.println("���j���[���Ԉ���Ă��܂�");
		}
		
	}
}