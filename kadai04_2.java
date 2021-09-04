import java.io.*;

public class kadai04_2
{
	public static void main (String[]args) throws IOException
	{

		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		String str1 = "";
		int j1 = 0;
		
		System.out.println("ŠJnŒ‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		str = br.readLine();
		int m1 = Integer.parseInt(str);
		
		if(!( m1 >= 1 && m1 <= 12 )){
			System.out.println("³‚µ‚¢”’l‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
			return;
		}
		
		System.out.println("I—¹Œ‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		str = br.readLine();
		int m2 = Integer.parseInt(str);
		
		if(!( m2 >= 1 && m2 <= 12 && m2 > m1 )){
			System.out.println("³‚µ‚¢”’l‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
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
			
			System.out.println("\n" + m + "ŒƒJƒŒƒ“ƒ_[");
			
			for(int i = 1; i <= j1; i++){
				
				switch(m){
				case  1:
					if(i==1){
					str1 = "Œ³’U";
					}
					else if(i==13){
					str1 = "¬l";
					}
					break;
				case  3:
					if(i==20){
					str1 = "t•ª";
					}
					break;
				case  5:
					if(i==3){
					str1 = "Œ›–@";
					}
					else if(i==4){
					str1 = "‚İ‚Ç‚è";
					}
					else if(i==5){
					str1 = "q‚Ç‚à";
					}
					break;
				case  7:
					if(i==23){
					str1 = "ŠC";
					}
					else if(i==24){
					str1 = "‘Ìˆç";
					}
					break;
				case  8:
					if(i==11){
					str1 = "R";
					}
					break;
				case 10:
				case 12:
					break;
				case  4:
					if(i==29){
					str1 = "º˜a";
					}
					break;
				case  6:
					break;
				case  9:
					if(i==21){
					str1 = "Œh˜V";
					}
					else if(i==22){
					str1 = "H•ª";
					}
					break;
				case 11:
					if(i==3){
					str1 = "•¶‰»";
					}
					else if(i==23){
					str1 = "‹Î˜J";
					}
					break;
				case  2:
					if(i==11){
					str1 = "Œš‘";
					}
					else if(i==23){
					str1 = "“Vc";
					}
					break;
				}
				
				if(m==5 && i==4){
					System.out.print(" " + i + str1);
				}
				else if(m==5 && i==5){
					System.out.print(" " + i + str1);
				}
				else if(((i%7) == 0) && i < 10){
					System.out.print(" " + i + str1 +"\t");
					System.out.print("\n");
				}
				else if((i%7) == 0){
					System.out.print( i + str1 +"\t");
					System.out.print("\n");
				}
				else if(i < 10){
					System.out.print(" "+ i + str1 + "\t");
				}
				else{
					System.out.print( i + str1 + "\t");
				}
				
				str1 = "";
			}
		System.out.print("\n");
		}
	}
}