
public class tokuten{

	
	void hyouji(int sum,int max, int min, int cnt){
		
		System.out.println("合計点" + sum);
		
		System.out.print("平均点" + sum / cnt + "\t");
		graph(sum/cnt/5)
		//for(int i = 0; i <= sum / cnt / 5; i++){
		//	System.out.print("*");
		//}	
		System.out.print("\n");
		
		System.out.print("最高点" + max + "\t");
		graph(max/5)
		//for(int i = 0; i <= max / 5; i++){
		//	System.out.print("*");
		//}
		System.out.print("\n");
		
		System.out.print("最低点" + min + "\t");
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

