
public class tokuten{

	
	void hyouji(int sum,int max, int min, int cnt){
		
		System.out.println("���v�_" + sum);
		
		System.out.print("���ϓ_" + sum / cnt + "\t");
		graph(sum/cnt/5)
		//for(int i = 0; i <= sum / cnt / 5; i++){
		//	System.out.print("*");
		//}	
		System.out.print("\n");
		
		System.out.print("�ō��_" + max + "\t");
		graph(max/5)
		//for(int i = 0; i <= max / 5; i++){
		//	System.out.print("*");
		//}
		System.out.print("\n");
		
		System.out.print("�Œ�_" + min + "\t");
		graph(min/5)
		//for(int i = 0; i <= min / 5; i++){
		//	System.out.print("*");
		//}	
	}
	
	void graph(int num){
		for(int i=1; i<=num; i++){
			System,out.print("*");
		}
	}
}

