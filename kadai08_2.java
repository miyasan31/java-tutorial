import java.io.*;

public class kadai08_2{

	public static void main(String[] args) throws IOException{
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		String nm = "";
		int tmp = 0;
		
		System.out.println("�e�X�g�̎󌱎Ґ�����͂��Ă�������");
		str = br.readLine();
		int ten = Integer.parseInt(str);
		
		int test[] = new int[ten];
		
		String[] name = new String[ten];
		
		for(int i = 0; i < test.length; i++){
			System.out.println( (i + 1) +"�l�ڂ̎�������͂��Ă�������");
			name[i] = br.readLine();
			
			System.out.println( name[i] +"����̓_������͂��Ă�������");
			str = br.readLine();
			test[i] = Integer.parseInt(str);
			System.out.println("\n");
		}
		
		System.out.println("���ёւ��̏������w�肵�Ă�������");
		System.out.println("�����F�P �~���F�Q");
		System.out.println("\n");
		
		str = br.readLine();
		int jun = Integer.parseInt(str);
		if(!(jun == 1 || jun == 2)){
				System.out.println("�����Ɠ��͂��Ă� �������");
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
				System.out.println("�������_���i�����j����");
				System.out.println("����\t���_");
				for(int j = 0; j < test.length; j++){
					System.out.println(rank +  "\t" + name[j] +  "\t" + test[j] + "�_");
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
				System.out.println("�������_���i�~���j����");
				System.out.println("����\t���_");
				for(int j = 0; j < test.length; j++){
					System.out.println(rank + "\t" + name[j] +  "\t" + test[j] + "�_");
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
