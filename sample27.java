import java.io.*;

class sample27
{
	public static void main (String[]args) throws IOException
	{
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		
		System.out.println("�N�����͂��Ă�������");
		str = br.readLine();
		int num1 =Integer.parseInt(str);

		System.out.println("���ʂ���͂��Ă�������");
		str = br.readLine();
		int num2 =Integer.parseInt(str);
				
		if(num1 >= 60){
			System.out.println("������500�~�ł�");
		}
		else if(num1 >= 50 && num2 == 1){
			System.out.println("������1200�~�ł�");
		}
		else if(num1 >= 20 && num2 == 2){
			System.out.println("������1000�~�ł�");
		}
		else{
		System.out.println("������1500�~�ł�");
		}
		
	}
}