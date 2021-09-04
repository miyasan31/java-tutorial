import java.io.*;

public class kadai07_12{

	public static void main(String[] args) throws IOException{
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		
		System.out.println("�������͂��Ă�������");
		str = br.readLine();
		int yy =Integer.parseInt(str);
				
		System.out.println("�J�n������͂��Ă�������");
		str = br.readLine();
		int s_mm =Integer.parseInt(str);
		
		if(!( s_mm >= 1 && s_mm <= 12 )){
			System.out.println("���������l����͂��Ă�������");
			return;
		}	
						
		System.out.println("�I��������͂��Ă�������");
		str = br.readLine();
		int g_mm =Integer.parseInt(str);
		
		if(!( g_mm >= 1 && g_mm <= 12 && s_mm < g_mm)){
			System.out.println("���������l����͂��Ă�������");
			return;
		}	
		
		for(int mm = s_mm; mm < g_mm + 1 ; mm = mm + 2){
				
				day_of_week obj1 = new day_of_week();
				int wk1 = obj1.youbi(yy, mm, 1); //�����P���̗j�����擾
				
				int max_dd1 = 31;
				
				switch(mm){
					case  4:
					case  6:
					case  9:
					case 11:
						max_dd1 = 30;
						break;
					case  2:
						leap_year obj2 = new leap_year();
						max_dd1 = obj2.uruudosi(yy); 
						break;
				}
			
				int cnt_dd1 = 1; //�J�E���^�[��`
				
				int cal_tbl1[][]  = new int[6][7];
				
				for(int i = 0; i < 6; i++){
					for(int j = 0; j < 7; j++){
						cal_tbl1[i][j] = 0;
					}	
				}
				
				for(int i = 0; i < 6; i++){
					for(int j = 0; j < 7; j++){
						if(i == 0){
							if(j > wk1-1){
								cal_tbl1[i][j] = cnt_dd1;
								cnt_dd1++;
							}
						}
						else if(cnt_dd1 <= max_dd1){
							cal_tbl1[i][j] = cnt_dd1;
							cnt_dd1++;
						}
					}	
				}
				
			//-----------------------------------------------------------------------------------------------------------------------------------------------------------------
				
				int wk2 = 0;
				int cal_tbl2[][]  = new int[6][7];
				int cnt_dd2 = 1; //�J�E���^�[��`
				int max_dd2 = 31;
			
				if(mm < 12){
					day_of_week obj2 = new day_of_week();
					wk2 = obj2.youbi(yy, mm+1, 1); //�����P���̗j�����擾
				}
			
				if(wk2 != 0){
					switch(mm+1){
						case  4:
						case  6:
						case  9:
						case 11:
							max_dd2 = 30;
							break;
						case  2:
							leap_year obj2 = new leap_year();
							max_dd2 = obj2.uruudosi(yy); 
							break;
					}
					
					for(int i = 0; i < 6; i++){
						for(int k = 0; k < 7; k++){
							cal_tbl2[i][k] = 0;
						}	
					}
					
					for(int i = 0; i < 6; i++){
						for(int k = 0; k < 7; k++){
							if(i == 0){
								if(k > wk2-1){
									cal_tbl2[i][k] = cnt_dd2;
									cnt_dd2++;
								}
							}
							else if(cnt_dd2 <= max_dd2){
								cal_tbl2[i][k] = cnt_dd2;
								cnt_dd2++;
							}
						}
					}
				}
			
				else if(wk2 == 0){
					
					cnt_dd2 = 0;
					
					for(int i = 0; i < 6; i++){
						for(int k = 0; k < 7; k++){
							cal_tbl2[i][k] = 0;
						}	
					}
					
					for(int i = 0; i < 6; i++){
						for(int k = 0; k < 7; k++){
							cal_tbl2[i][k] = cnt_dd2;
						}
					}
				}
			
			//-----------------------------------------------------------------------------------------------------------------------------------
		
				if(mm >= g_mm){
					
					System.out.println("\t" + yy  + "�N" + mm + "���J�����_�[" + "\t\t");
					System.out.println("------------------------------------"); 
					System.out.println("|"+" "+"��"+" "+"|"+" "+"��"+" "+"|"+" "+"��"+" "+"|"+" "+"��"+" "+"|"+" "+"��"+" "+"|"+" "+"��"+" "+"|"+" "+"�y"+" "+"|");
					System.out.println("------------------------------------");
					
					for(int i = 0; i < 6; i++){
						for(int j = 0; j < 7; j++){
							if(cal_tbl1[i][j] == 0){
								System.out.print("|"+"    ");
							}		
							else if(cal_tbl1[i][j] < 10){
								System.out.print("|"+"  "+cal_tbl1[i][j]+" ");
							}
							else{
								System.out.print("|"+" "+cal_tbl1[i][j]+" ");
							}
						}
						System.out.println("|");
						System.out.println("------------------------------------");
					}
					break;
				}
				
				else{
					
					System.out.print("\t" + yy  + "�N" + mm + "���J�����_�[" + "\t\t");
					System.out.println("\t" + yy  + "�N" + (mm + 1) + "���J�����_�[");
					System.out.print("------------------------------------" + "\t");
					System.out.println("------------------------------------"); 
					System.out.print("|"+" "+"��"+" "+"|"+" "+"��"+" "+"|"+" "+"��"+" "+"|"+" "+"��"+" "+"|"+" "+"��"+" "+"|"+" "+"��"+" "+"|"+" "+"�y"+" "+"|" + "\t");
					System.out.println("|"+" "+"��"+" "+"|"+" "+"��"+" "+"|"+" "+"��"+" "+"|"+" "+"��"+" "+"|"+" "+"��"+" "+"|"+" "+"��"+" "+"|"+" "+"�y"+" "+"|");
					System.out.print("------------------------------------" + "\t");
					System.out.println("------------------------------------");
					
					for(int i = 0; i < 6; i++){
						for(int j = 0; j < 7; j++){
							if(cal_tbl1[i][j] == 0){
								System.out.print("|"+"    ");
							}		
							else if(cal_tbl1[i][j] < 10){
								System.out.print("|"+"  "+cal_tbl1[i][j]+" ");
							}
							else{
								System.out.print("|"+" "+cal_tbl1[i][j]+" ");
							}
						}
						
						System.out.print("|" + "\t");
						
						for(int k = 0; k < 7; k++){
							if(cal_tbl2[i][k] == 0){
								System.out.print("|"+ "    ");
							}		
							else if(cal_tbl2[i][k] < 10){
								System.out.print("|"+"  "+cal_tbl2[i][k] + " ");
							}
							else{
								System.out.print("|"+" "+cal_tbl2[i][k] + " ");
							}
						}
						System.out.println("|");
						System.out.print("------------------------------------" + "\t");
						System.out.println("------------------------------------");
					}
				}
			System.out.print("\n");
		}
	}
}
