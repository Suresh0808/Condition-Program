package loop;

public class overloading {
	
	public void method(int a, int b, int c) {
		System.out.println(a*b*c);
	}
	public void method(int a, String S)
	{
		System.out.println("Welcome Java");
		
	}
	public void method(int a, int b) {
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
	}
	public static void main(String[] args) {
		overloading result= new overloading();
		result.method(10,20,30);
		result.method(7,"Good");
		result.method(6,5);
	}
	
}

