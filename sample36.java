import java.io.*;

class sample36
{
	public static void main (String[]args) throws IOException
	{
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		
		System.out.println("�ȖڋL������͂��Ă�������");
		str = br.readLine();
		
		switch(str){
		case "JV15":
			System.out.println("�Óc�搶");
			break;
		case "CS15":
			System.out.println("���J�搶");
			break;
		case "WB15":
			System.out.println("�R���搶");
			break;
		default :
			System.out.println("�Y������搶�͂��܂���");
			break;
		}
		
	}
}