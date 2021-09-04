import java.io.*;

public class kadai06{

	public static void main(String[] args) throws IOException{
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		
		System.out.println("¼—ï‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		str = br.readLine();
		int yy =Integer.parseInt(str);
				
		System.out.println("Œ‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		str = br.readLine();
		int mm =Integer.parseInt(str);
		
		
		day_of_week obj1 = new day_of_week();
		int wk = obj1.youbi(yy, mm, 1); //›Œ‚P“ú‚Ì—j“ú‚ğæ“¾
		
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
		
		System.out.println("\n" + yy  + "”N" + mm + "ŒƒJƒŒƒ“ƒ_[" + "\n");
		System.out.println("“ú\tŒ\t‰Î\t…\t–Ø\t‹à\t“y");
		
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

		
	}
}
