import java.io.*;

class sample21
{
	public static void main (String[]args) throws IOException
	{
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		
		System.out.println("�N�����͂��Ă�������");
		str = br.readLine();
		int num =Integer.parseInt(str);
		
		if(num >= 20){ //20�Έȏ�Ȃ�Ή��̏��������s�����
			System.out.println("20�Έȏ�ł�");
		}
		else{
			System.out.println("20�Ζ����ł�");
		}
	}
}