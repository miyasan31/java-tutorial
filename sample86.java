import java.io.*;

public class sample86{

	public static void main(String[] args) throws IOException{
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		
				
		System.out.println("�N���X�̐l���͉��l�ł����H");
		str = br.readLine();
		int num = Integer.parseInt(str);
		
		int[][] a = new int[num][3];
		
		for(int i = 0; i < num; i++){
			
			for(int j = 0; j < 3; j++){
				if(j == 0){
					
				System.out.println("����̓��_�́H");
				str = br.readLine();
				int num1 = Integer.parseInt(str);
					
				a[i][j] = num1;
				}
				if(j == 1){
					
				System.out.println("���w�̓��_�́H");
				str = br.readLine();
				int num2 = Integer.parseInt(str);
					
				a[i][j] = num2;
				}
				if(j == 2){
					
				System.out.println("�Љ�̓��_�́H");
				str = br.readLine();
				int num3 = Integer.parseInt(str);
					
				a[i][j] = num3;
				}
			}	
			
		}
		

		for(int i = 0; i < num; i++){
			for(int j = 0; j < 3; j++){
				System.out.print(a[i][j] + "\t");
			}
			System.out.print("\n");
		}
		
	}
}




