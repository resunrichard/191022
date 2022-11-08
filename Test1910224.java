// Example for explicity 
public class Test1910224{
public static void main(String args[]) {
	float f=10.50f; //4 bytes
	//int a=f; //C.T. Error 
	int a=(int)f;	
	System.out.println(f);//10.50
	System.out.println(a);//10
}
}
