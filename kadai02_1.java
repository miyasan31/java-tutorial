/*
�e�[�}:�I�v�V����1 �����o�[��
�����:PI11A172_29_�{������
�����:2020.06.03
*/

import java.io.*;

class kadai02_1
{
	public static void main (String[]args) throws IOException
	{
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		
		System.out.println("�����̎������z����͂��Ă�������");
		str = br.readLine();
		int num1 = Integer.parseInt(str);
		
		System.out.println("�挎�̌J�z���z����͂��Ă�������");
		str = br.readLine();
		int num2 = Integer.parseInt(str);
		
		System.out.println("�P���̕��ώx�o�z����͂��Ă�������");
		str = br.readLine();
		int num3 = Integer.parseInt(str);
		
		
		
		System.out.println("*****************************");
		
		System.out.println("�����o�[��");
		
		System.out.println("�����̎g�p�\���z��:" + (num1 + num2) + "�~");
		System.out.println("�P���̎g�p�\���z��:" + ((num1 + num2) / 30) + "�~");
		System.out.println("�����̎x�o�\�z���z��:" + (num3 * 30) + "�~");
		System.out.println("�����̌J�z�\�z���z��:" + ((num1 + num2) - (num3 * 30)) + "�~");
		
		System.out.println("*****************************");
		
	}
}