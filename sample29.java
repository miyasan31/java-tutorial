import java.io.*;

class sample29
{
	public static void main (String[]args) throws IOException
	{
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		
		System.out.println("��������͂��Ă�������");
		str = br.readLine();
		
		switch(str){
		case "����������" :
			System.out.println(str + "�����͂���܂���");
			break;
		case "����������" :
			System.out.println(str + "�����͂���܂���");
			break;
		default :
			System.out.println("���͂��Ԉ���Ă��܂�");
			break;
		}
		
	}
}