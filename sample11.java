import java.io.*;

class sample11
{
	public static void main (String[]args) throws IOException
	{
		System.out.println("��������͂��Ă�������");
		
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		System.out.println( str + "�����͂���܂����B");
		
	}
}