import java.io.*;

class sample25
{
	public static void main (String[]args) throws IOException
	{
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		String str = "";

		System.out.println("�N�����͂��Ă�������");
		str = br.readLine();
		int num1 =Integer.parseInt(str);
		
		System.out.println("���ʂ���͂��Ă��������i�j���F1 �����F2�j");
		str = br.readLine();
		int num2 =Integer.parseInt(str);
		
		if(num1 >= 20){
			if(num2 == 2){
			System.out.println("������1000�~�ł�");
			}
			else{
			System.out.println("������1500�~�ł�");
			}
		}
		else{
			System.out.println("������1500�~�ł�");
		}

	}
}