import java.io.*;
import java.util.Date;
import java.util.Calendar;

public class sample82{

	public static void main(String[] args){
		
		int[] num = new int[5]; //配列定義
		
		for(int j = 0; j < 5; j++){ //for文で格納処理
			num[j] = (j + 1) * 10;
		}
		
		
		for(int i = 0; i < 5; i++){ //forで出力処理
		
		System.out.println(num[i]);
		
		}
	}
	
}





