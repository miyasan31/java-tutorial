import java.io.*;

class sample13
{
	public static void main (String[]args) throws IOException
	{
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("���É��̓V�C�́H");
		String str1 = br.readLine();
		
		System.out.println("�����̓V�C�́H");
		String str2 = br.readLine();
		
		System.out.println("�j���[���[�N�̓V�C�́H");
		String str3 = br.readLine();		
		
		
		System.out.println("���É��̓V�C�́u" + str1 + "�v�ł��B");
		System.out.println("�����̓V�C�́u" + str2 + "�v�ł��B");
		System.out.println("�j���[���[�N�̓V�C�́u" + str3 + "�v�ł��B" );
		
	}
}