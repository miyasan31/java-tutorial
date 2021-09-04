public class sample62{
	
	public static void main (String[] args){
		
		//kazuのクラスを呼び出す（違うクラスファイルから）
		kazu obj1 = new kazu();
		obj1.a = 50;
		obj1.b = 60;
		
		kazu obj2 = new kazu();
		obj2.a = 70;
		obj2.b = 80;
		
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		
		System.out.println(obj2.a);
		System.out.println(obj2.b);

	}
}
