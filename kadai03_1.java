import java.io.*;

public class kadai03_1
{
	public static void main (String[]args) throws IOException
	{
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		String str1 = "";
//***********************************************************************************************************
		
		System.out.println("�N���X�L������͂��Ă�������");
		str1 = br.readLine();
		
		if(!(str1.equals("PI11A172")||str1.equals("PW11A172"))){
			System.out.println("�G���[");
			return;
		}	
//***********************************************************************************************************
		
		System.out.println("�o�Ȕԍ�����͂��Ă�������");
		str = br.readLine();
		int num4 = Integer.parseInt(str);
		
		if(str1.equals("PI11A172")){
			if(!(num4>=1 && num4<=5)){
				System.out.println("�G���[");
				return;
			}
		}
//***********************************************************************************************************
		
		else if(str1.equals("PW11A172")){
			if(!(num4>=1 && num4<=4)){
				System.out.println("�G���[");
				return;
			}
		}
//***********************************************************************************************************

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
		
		int num3 = num1 + num2;
//***********************************************************************************************************
		
		System.out.println("************************************");
		System.out.println("���Ǝ�������");
		System.out.println("�N���X�L���F" + str1);		
		System.out.println("�o�Ȕԍ��F" + num4);
		
		if(str1.equals("PI11A172")){
			switch(num4){
			case 1:
				System.out.println("�����F���q�@���ގq");
				break;
			case 2:
				System.out.println("�����F�r�؁@�_�i");
				break;
			case 3:
				System.out.println("�����F�r�c�@���I");
				break;
			case 4:
				System.out.println("�����F�P��@�m��");
				break;
			case 5:
				System.out.println("�����F���@�Ǒ�");
				break;
			}
		}
		
		else if(str1.equals("PW11A172")){
			switch(num4){
			case 1:
				System.out.println("�����F�ΐ�@�G��");
				break;
			case 2:
				System.out.println("�����F�ɓ��@����");
				break;
			case 3:
				System.out.println("�����F���@����");
				break;
			case 4:
				System.out.println("�����F�����@�a��");
				break;
			}		
		}
		
		
		System.out.println("�ߑO�F" + num1 + "�_");
		System.out.println("�ߌ�F" + num2 + "�_");
		System.out.println("���v�F" + num3 + "�_");
		
		if(num1>=65 && num2>=65 && num3>=140){
			System.out.println("����F���i");
		}
		else{
			System.out.println("����F�s���i");
		}
		
		System.out.println("************************************");
	}
}