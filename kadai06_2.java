import java.io.*;

public class kadai06_2{

	public static void main(String[] args) throws IOException{
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		
		System.out.println("�J�n�N����͂��Ă�������");
		str = br.readLine();
		int s_yy =Integer.parseInt(str);

		System.out.println("�J�n������͂��Ă�������");
		str = br.readLine();
		int s_mm =Integer.parseInt(str);
		
		System.out.println("�I���N����͂��Ă�������");
		str = br.readLine();
		int g_yy =Integer.parseInt(str);
						
		System.out.println("�I��������͂��Ă�������");
		str = br.readLine();
		int g_mm =Integer.parseInt(str);
		
		int re_mm = s_mm;
		
		
		for(int yy = s_yy; yy != g_yy + 1; yy++){
			
			
			if(yy != g_yy){
				
				for(int mm = re_mm; mm <= 12 ; mm++){
					
					day_of_week obj1 = new day_of_week();
					int wk = obj1.youbi(yy, mm, 1); //�����P���̗j�����擾
				
					int max_dd = 31;
					switch(mm){
						case  4:
						case  6:
						case  9:
						case 11:
							max_dd = 30;
							break;
						case  2:
							leap_year obj2 = new leap_year();
							max_dd = obj2.uruudosi(yy); 
							break;
					}
				
					System.out.println("\n" + yy  + "�N" + mm + "���J�����_�[" + "\n");
					System.out.println("��\t��\t��\t��\t��\t��\t�y");
					
					int i;
					for(i = 0; i < (wk - 1); i++){
						System.out.print(" " + "\t");
					}
					
					for(int j = 1; j <= max_dd; j++){
						if((((i+j)%7) == 0) && (i+j) < 10+i){
							System.out.print(" " + j + "\t");
							System.out.print("\n");
						}
						else if(((i+j)%7) == 0){
							System.out.print( j + "\t");
							System.out.print("\n");
						}
						else if((i+j) < 10+i){
							System.out.print(" "+ j + "\t");
						}
						else{
							System.out.print( j + "\t");
						}
					}
					
					System.out.print("\n");
					re_mm = 1;
				}
				
			}
			else{
				
				for(int mm = 1; mm != g_mm + 1 ; mm++){
					
					day_of_week obj1 = new day_of_week();
					int wk = obj1.youbi(yy, mm, 1); //�����P���̗j�����擾
				
					int max_dd = 31;
					switch(mm){
						case  4:
						case  6:
						case  9:
						case 11:
							max_dd = 30;
							break;
						case  2:
							leap_year obj2 = new leap_year();
							max_dd = obj2.uruudosi(yy); 
							break;
					}
				
					System.out.println("\n" + yy  + "�N" + mm + "���J�����_�[" + "\n");
					System.out.println("��\t��\t��\t��\t��\t��\t�y");
					
					int i;
					for(i = 0; i < (wk - 1); i++){
						System.out.print(" " + "\t");
					}
					
					for(int j = 1; j <= max_dd; j++){
						if((((i+j)%7) == 0) && (i+j) < 10+i){
							System.out.print(" " + j + "\t");
							System.out.print("\n");
						}
						else if(((i+j)%7) == 0){
							System.out.print( j + "\t");
							System.out.print("\n");
						}
						else if((i+j) < 10+i){
							System.out.print(" "+ j + "\t");
						}
						else{
							System.out.print( j + "\t");
						}
					}
					
					System.out.print("\n");
				}
			
			
			
			
			
			
			}
			
			
			
			System.out.print("\n");
			
		}
		
	}
}
