import java.io.*;

public class kadai08_2{

	public static void main(String[] args) throws IOException{
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		String nm = "";
		int tmp = 0;
		
		System.out.println("テストの受験者数を入力してください");
		str = br.readLine();
		int ten = Integer.parseInt(str);
		
		int test[] = new int[ten];
		
		String[] name = new String[ten];
		
		for(int i = 0; i < test.length; i++){
			System.out.println( (i + 1) +"人目の氏名を入力してください");
			name[i] = br.readLine();
			
			System.out.println( name[i] +"さんの点数を入力してください");
			str = br.readLine();
			test[i] = Integer.parseInt(str);
			System.out.println("\n");
		}
		
		System.out.println("並び替えの順序を指定してください");
		System.out.println("昇順：１ 降順：２");
		System.out.println("\n");
		
		str = br.readLine();
		int jun = Integer.parseInt(str);
		if(!(jun == 1 || jun == 2)){
				System.out.println("ちゃんと入力してね もう一回");
			return;
		}
		
		int rank = 1;
		
		switch(jun){
			case 1:
				for(int i = test.length - 1; i > 0; i--){
					for(int j = 0; j < i; j++){
						if(test[j] > test[j + 1]){
							tmp = test[j];
							nm = name[j];
							test[j] = test[j + 1];
							name[j] = name[j + 1];
							test[j + 1] = tmp;
							name[j + 1] = nm;
						}
					}
				}
				System.out.println("＊＊得点順（昇順）＊＊");
				System.out.println("順位\t得点");
				for(int j = 0; j < test.length; j++){
					System.out.println(rank +  "\t" + name[j] +  "\t" + test[j] + "点");
					if(test.length - 1 != j){
						if(test[j] < test[j + 1] ){
							rank = rank + 1;
						}
					}
				}
				break;
			
			case 2:
				for(int i = test.length - 1; i > 0; i--){
					for(int j = 0; j < i; j++){
						if(test[j] < test[j + 1]){
							tmp = test[j];
							nm = name[j];
							test[j] = test[j + 1];
							name[j] = name[j + 1];
							test[j + 1] = tmp;
							name[j + 1] = nm;
						}
					}
				}
				System.out.println("＊＊得点順（降順）＊＊");
				System.out.println("順位\t得点");
				for(int j = 0; j < test.length; j++){
					System.out.println(rank + "\t" + name[j] +  "\t" + test[j] + "点");
					if(test.length - 1 != j){
						if(test[j] > test[j + 1]){
							rank = rank + 1;
						}
					}
				}
				break;
		}
		
	}
}
