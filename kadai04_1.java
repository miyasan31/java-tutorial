import java.io.*;

public class kadai04_1
{
	public static void main (String[]args) throws IOException
	{

		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		int j1 = 0;
		
		System.out.println("�J�n������͂��Ă�������");
		str = br.readLine();
		int m1 = Integer.parseInt(str);
		
		if(!( m1 >= 1 && m1 <= 12 )){
			System.out.println("���������l����͂��Ă�������");
			return;
		}
		
		System.out.println("�I��������͂��Ă�������");
		str = br.readLine();
		int m2 = Integer.parseInt(str);
		
		if(!( m2 >= 1 && m2 <= 12 && m2 > m1 )){
			System.out.println("���������l����͂��Ă�������");
			return;
		}
		
		
		for(int m = m1; m != m2 + 1 ; m++){
			
			switch(m){
			case  1:
			case  3:
			case  5:
			case  7:
			case  8:
			case 10:
			case 12:
				j1 = 31;
				break;
			case  4:
			case  6:
			case  9:
			case 11:
				j1 = 30;
				break;
			case  2:
				j1 = 28;
				break;
			}
			
			System.out.println("\n" + m + "���J�����_�[");
			
			for(int i = 1; i <= j1; i++){
				if(((i%7) == 0) && i < 10){
					System.out.print(" " + i + "\t");
					System.out.print("\n");
				}
				else if((i%7) == 0){
					System.out.print( i + "\t");
					System.out.print("\n");
				}
				else if(i < 10){
					System.out.print(" "+ i + "\t");
				}
				else{
					System.out.print( i + "\t");
				}
			}
		System.out.print("\n");
		}
	}
}