/*
�e�[�}:�l�����Z�v���O����
�����:PI11A172_29_�{������
�����:2020.06.03
*/

import java.io.*;

class kadai02
{
	public static void main (String[]args) throws IOException
	{
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		String str = " ";
		
		System.out.println("���l1����͂��Ă�������");
		str = br.readLine();
		int num1 = Integer.parseInt(str);
		
		System.out.println("���l2����͂��Ă�������");
		str = br.readLine();
		int num2 = Integer.parseInt(str);
		
		System.out.println("***********");
		
		System.out.println( num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.println( num1 + " - " + num2 + " = " + (num1 - num2));
		System.out.println( num1 + " * " + num2 + " = " + (num1 * num2));
		System.out.println( num1 + " / " + num2 + " = " + (num1 / num2) + " �c " + (num1 % num2));
		
		System.out.println("***********");
		
	}
}