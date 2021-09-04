import java.io.*;

class sample25
{
	public static void main (String[]args) throws IOException
	{
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		String str = "";

		System.out.println("”N—î‚ð“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		str = br.readLine();
		int num1 =Integer.parseInt(str);
		
		System.out.println("«•Ê‚ð“ü—Í‚µ‚Ä‚­‚¾‚³‚¢i’j«F1 —«F2j");
		str = br.readLine();
		int num2 =Integer.parseInt(str);
		
		if(num1 >= 20){
			if(num2 == 2){
			System.out.println("—¿‹à‚Í1000‰~‚Å‚·");
			}
			else{
			System.out.println("—¿‹à‚Í1500‰~‚Å‚·");
			}
		}
		else{
			System.out.println("—¿‹à‚Í1500‰~‚Å‚·");
		}

	}
}