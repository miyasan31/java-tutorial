import java.io.*;

class sample35
{
	public static void main (String[]args) throws IOException
	{
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		
		System.out.println("�ȖڋL������͂��Ă�������");
		str = br.readLine();
		
		if(str.equals("JV15")){
		System.out.println("�Óc�搶");
		}
		else if(str.equals("CS15")){
		System.out.println("���J�搶");
		}
		else if(str.equals("WB15")){
		System.out.println("�R���搶");
		}
		else{
		System.out.println("�Y������搶�͂��܂���");
		}
	}
}
