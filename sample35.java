import java.io.*;

class sample35
{
	public static void main (String[]args) throws IOException
	{
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		
		System.out.println("科目記号を入力してください");
		str = br.readLine();
		
		if(str.equals("JV15")){
		System.out.println("古田先生");
		}
		else if(str.equals("CS15")){
		System.out.println("中谷先生");
		}
		else if(str.equals("WB15")){
		System.out.println("山口先生");
		}
		else{
		System.out.println("該当する先生はいません");
		}
	}
}
