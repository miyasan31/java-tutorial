import java.io.*;

class sample28
{
	public static void main (String[]args) throws IOException
	{
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		
		System.out.println("��������͂��Ă�������");
		str = br.readLine();
		int res =Integer.parseInt(str);
		
		switch(res){
		case 1 :
			System.out.println("1�����͂���܂���");
			break;
		case 2 :
			System.out.println("2�����͂���܂���");
			break;
		default :
			System.out.println("1��2����͂��ĉ�����");
			break;
		}
		
	}
}