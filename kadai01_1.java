import java.io.*;

class kadai01_1
{
	public static void main (String[]args) throws IOException
	{
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("�����́H");
		String str1 = br.readLine();
		
		System.out.println("�N��́H");
		String str2 = br.readLine();
		
		System.out.println("��́H");
		String str3 = br.readLine();		
		
		System.out.println("�o�g�n�́H");
		String str4 = br.readLine();
		
		System.out.println("�����R�����g�͂���܂����H");
		String str5 = br.readLine();
		
		System.out.println("���͂̎����́u" + str1 + "�v�ł��B");
		System.out.println("�N��́u" + str2 + "�v�ł��B");
		System.out.println("��Ƃ��āu" + str3 + "�v������Ă��܂��B" );
		System.out.println("�u" + str4 + "�v�������ĎQ��܂����B");
		System.out.println("�Ō�Ɉꌾ�E�E�E�u" + str5 + "�v�B");		
		
		
	}
}