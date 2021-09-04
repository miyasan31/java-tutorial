import java.io.*;

public class sample85{

	public static void main(String[] args){
		
		int[][] num = new int[9][9];
		
		for(int i = 0; i < 9; i++){
			for(int j = 0; j < 9; j++){
				num[i][j] = (i+1)*(j+1);
			}	
		}
		
		for(int i = 0; i < 9; i++){
			for(int j = 0; j < 9; j++){
				System.out.print(num[i][j] + "\t");
			}
			System.out.print("\n");
		}
		
	}
}




