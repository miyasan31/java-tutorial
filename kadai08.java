import java.io.*;

public class kadai08{

	public static void main(String[] args) throws IOException{
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		int tmp = 0;
		
		System.out.println("テストの受験者数を入力してください");
		str = br.readLine();
		int ten = Integer.parseInt(str);
		
		int test[] = new int[ten];
		
		for(int i = 0; i < test.length; i++){
			System.out.println( (i + 1) +"人目の点数を入力してください");
			str = br.readLine();
			test[i] = Integer.parseInt(str);
		}
		
		System.out.println("並び替えの順序を指定してください");
		System.out.println("昇順：１ 降順：２");
		str = br.readLine();
		int jun = Integer.parseInt(str);
		if(!(jun == 1 || jun == 2)){
				System.out.println("ちゃんと入力してね もう一回");
			return;
		}
		
		switch(jun){
			case 1:
				for(int i = test.length - 1; i > 0; i--){
					for(int j = 0; j < i; j++){
						if(test[j] > test[j + 1]){
							tmp = test[j];
							test[j] = test[j + 1];
							test[j + 1] = tmp;
						}
					}
				}
				System.out.println("＊＊得点順（昇順）＊＊");
				for(int j = 0; j < test.length; j++){
					System.out.println(test[j] + "点");
				}
				break;
			
			case 2:
				for(int i = test.length - 1; i > 0; i--){
					for(int j = 0; j < i; j++){
						if(test[j] < test[j + 1]){
							tmp = test[j];
							test[j] = test[j + 1];
							test[j + 1] = tmp;
						}
					}
				}
				System.out.println("＊＊得点順（降順）＊＊");
				for(int j = 0; j < test.length; j++){
					System.out.println(test[j] + "点");
				}
				break;
		}
		
	}
}
