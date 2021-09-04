/*
�e�[�}:�I�v�V����1 BMI�l�v�Z
�����:PI11A172_29_�{������
�����:2020.06.03
*/

import java.io.*;

class kadai02_2
{
	public static void main (String[]args) throws IOException
	{
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		
		System.out.println("�g���icm�j����͂��Ă�������");
		str = br.readLine();
		float num1 = Float.parseFloat(str);
		
		float num3 = num1/100;//�P�ʂ�cm����m�֕ϊ�
		
		System.out.println("�̏d�ikg�j����͂��Ă�������");
		str = br.readLine();
		float num2 = Float.parseFloat(str);
		
		
		System.out.println("*****************************");
		
		System.out.println("BMI�v�Z");
		
		System.out.println("�g��	 :" + num1 + "cm");
		System.out.println("�̏d	 :" + num2 + "kg");
		System.out.println("BMI�l	 :" + (num2 / (num3 * num3 )));
		System.out.println("�W���̏d :" + (num3 * num3 * 22) + "kg");
		System.out.println("�W���̏d�܂ł���" + ((num3 * num3 * 22) - num2) + "kg");
		
		System.out.println("*****************************");
		
	}
}