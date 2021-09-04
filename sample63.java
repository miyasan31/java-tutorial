public class sample63{
 
	public static void main (String[] args){
		
		kasan obj1 = new kasan();
		
		obj1.a = 10;
		obj1.b = 20;
		obj1.tasu();
	 
		kasan obj2 = new kasan();
		
		obj2.a = 30;
		obj2.b = 40;
		obj2.tasu();
		
		System.out.println(obj1.c);
		System.out.println(obj2.c);

	}
}
