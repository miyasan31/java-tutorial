import java.io.*;

class sample23
{
	public static void main (String[]args) throws IOException
	{
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		
		System.out.println("�N�����͂��Ă�������");
		str = br.readLine();
		int num =Integer.parseInt(str);
		
		if(num >= 20){
			
			if(num >= 50){
			System.out.println("50�Έȏ�ł�");
			}
			
			else{
			System.out.println("20�`49�΂ł�");
			}
			
		}
		else if(num >= 10){
			System.out.println("10�`19�΂ł�");
		}
		
		else{
			System.out.println("0�`9�΂ł�");
		}
		
	}
}