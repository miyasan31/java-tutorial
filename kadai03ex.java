import java.io.*;

class kadai03ex
{
	public static void main (String[]args) throws IOException
	{
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";

		System.out.println("�ߑO���_����͂��Ă�������");
		str = br.readLine();
		int num1 = Integer.parseInt(str);
		
		if(!(num1>=0 && num1<=100)){
			System.out.println("�G���[");
			return;
		}

		System.out.println("�ߌ㓾�_����͂��Ă�������");
		str = br.readLine();
		int num2 = Integer.parseInt(str);
		
		if(!(num2>=0 && num2<=100)){
			System.out.println("�G���[");
			return;
		}
		
		hantei obj = new hantei();
		String kekka = obj.gouhi(num1, num2);
		
		int num3 = num1 + num2;
		
		System.out.println("************************************");
		System.out.println("���Ǝ�������");
		System.out.println("�ߑO�F" + num1 + "�_");
		System.out.println("�ߌ�F" + num2 + "�_");
		System.out.println("���v�F" + num3 + "�_");
		System.out.println("���ہF" + kekka);
		System.out.println("************************************");

	}
}