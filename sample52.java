public class sample52{
	
	public static void main (String[] args){

		for(int i = 1; i <= 7; i++){
			for(int j = 1; j <= 7; j++){
				if( ((i+j)==8) || i==1 || i==7 ){
				System.out.print(" œ ");
				}
				else{
				System.out.print(" Z ");
				}
			}
			System.out.println("\n");
		}

	}
}
