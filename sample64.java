public class sample64{
 
	public static void main (String[] args){
		
		kasan1 obj1 = new kasan1();
		int i = 10;
		int j = 20;
		obj1.tasu(i,j);
		
		kasan1 obj2 = new kasan1();
		int x = 30;
		int y = 40;
		obj2.tasu(x,y);
		
		System.out.println(obj1.c);
		System.out.println(obj2.c);

	}
}
