public class sample61{
	
	public static void main (String[] args){
		
		kazu obj1 = new kazu();
		obj1.a = 10;
		obj1.b = 20;
		
		kazu obj2 = new kazu();
		obj2.a = 30;
		obj2.b = 40;
		
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		
		System.out.println(obj2.a);
		System.out.println(obj2.b);

	}
}


class kazu{

	int a;
	int b;

}