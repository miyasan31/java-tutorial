import java.io.*;

class sample36
{
	public static void main (String[]args) throws IOException
	{
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		
		System.out.println("科目記号を入力してください");
		str = br.readLine();
		
		switch(str){
		case "JV15":
			System.out.println("古田先生");
			break;
		case "CS15":
			System.out.println("中谷先生");
			break;
		case "WB15":
			System.out.println("山口先生");
			break;
		default :
			System.out.println("該当する先生はいません");
			break;
		}
		
	}
}