import java.io.*;

public class kadai07_2{

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
					
					int cnt_dd = 1; //�J�E���^�[��`
					
					int cal_tbl[][]  = new int[6][7];
					
					for(int i = 0; i < 6; i++){
						for(int j = 0; j < 7; j++){
							cal_tbl[i][j] = 0;
						}	
					}
					
					for(int i = 0; i < 6; i++){
						for(int j = 0; j < 7; j++){
							if(i == 0){
								if(j > wk-1){
									cal_tbl[i][j] = cnt_dd;
									cnt_dd++;
								}
							}
							else if(cnt_dd <= max_dd){
								cal_tbl[i][j] = cnt_dd;
								cnt_dd++;
							}
						}	
					}
					
					System.out.println("\t" + yy  + "�N" + mm + "���J�����_�[");
					System.out.println("------------------------------------");
					System.out.println("|"+" "+"��"+" "+"|"+" "+"��"+" "+"|"+" "+"��"+" "+"|"+" "+"��"+" "+"|"+" "+"��"+" "+"|"+" "+"��"+" "+"|"+" "+"�y"+" "+"|");
					System.out.println("------------------------------------");

					for(int i = 0; i < 6; i++){
						for(int j = 0; j < 7; j++){
							if(cal_tbl[i][j] == 0){
								System.out.print("|"+"    ");
							}
							else if(cal_tbl[i][j] < 10){
								System.out.print("|"+"  "+cal_tbl[i][j]+" ");
							}
							else{
								System.out.print("|"+" "+cal_tbl[i][j]+" ");
							}
						}	
						System.out.println("|");
						System.out.println("------------------------------------");
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
					
					int cnt_dd = 1; //�J�E���^�[��`
					
					int cal_tbl[][]  = new int[6][7];
					
					for(int i = 0; i < 6; i++){
						for(int j = 0; j < 7; j++){
							cal_tbl[i][j] = 0;
						}	
					}
					
					for(int i = 0; i < 6; i++){
						for(int j = 0; j < 7; j++){
							if(i == 0){
								if(j > wk-1){
									cal_tbl[i][j] = cnt_dd;
									cnt_dd++;
								}
							}
							else if(cnt_dd <= max_dd){
								cal_tbl[i][j] = cnt_dd;
								cnt_dd++;
							}
						}	
					}
					
					System.out.println("\t" + yy  + "�N" + mm + "���J�����_�[");
					System.out.println("------------------------------------");
					System.out.println("|"+" "+"��"+" "+"|"+" "+"��"+" "+"|"+" "+"��"+" "+"|"+" "+"��"+" "+"|"+" "+"��"+" "+"|"+" "+"��"+" "+"|"+" "+"�y"+" "+"|");
					System.out.println("------------------------------------");

					for(int i = 0; i < 6; i++){
						for(int j = 0; j < 7; j++){
							if(cal_tbl[i][j] == 0){
								System.out.print("|"+"    ");
							}
							else if(cal_tbl[i][j] < 10){
								System.out.print("|"+"  "+cal_tbl[i][j]+" ");
							}
							else{
								System.out.print("|"+" "+cal_tbl[i][j]+" ");
							}
						}	
						System.out.println("|");
						System.out.println("------------------------------------");
					}
				}
			System.out.print("\n");
			}
		}
	}
}
	