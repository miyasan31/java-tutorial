import java.io.*;

class sample12
{
	public static void main (String[]args) throws IOException
	{
		System.out.println("���É��̓V�C�́H");
		BufferedReader br1 =
			new BufferedReader(new InputStreamReader(System.in));
		String str1 = br1.readLine();
		
		
		System.out.println("�����̓V�C�́H");
		BufferedReader br2 =
			new BufferedReader(new InputStreamReader(System.in));
		String str2 = br2.readLine();
		
		
		System.out.println("�j���[���[�N�̓V�C�́H");
		BufferedReader br3 =
			new BufferedReader(new InputStreamReader(System.in));
		String str3 = br3.readLine();		
		
		System.out.println("���É��̓V�C�́u" + str1 + "�v�ł��B");
		System.out.println("�����̓V�C�́u" + str2 + "�v�ł��B");
		System.out.println("�j���[���[�N�̓V�C�́u" + str3 + "�v�ł��B" );
		
	}
}