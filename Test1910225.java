// Difference b/w Global and Local variable 
public class Test1910225{
	int x=4; // Globla variable
	static int y=5;
	public int add() {
		return x+y;
	}
	public int sum() {
		int a=10; // local variable 
		int b=15;
		return a+x;
	}
public static void main(String args[]) {
	Test t=new Test();
	System.out.println(t.sum());//14
	System.out.println(t.add());//9
	System.out.println(y);//5
	System.out.println(t.x);//4
}
}