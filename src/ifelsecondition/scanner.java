package ifelsecondition;

import java.util.Scanner;

public class scanner {
		
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = scan.nextLine();
		System.out.print("Enter your age");
		int age = scan.nextInt();
		System.out.print("Enter your Height");
		double height = scan.nextDouble();
		System.out.print("Enter your ContactNo");
		long contactno = scan.nextLong();
		System.out.println("Enter your address");
		scan.nextLine();
		String address = scan.nextLine();
		
		System.out.println("My Name is " + name);
		System.out.println("My Age is " + age);
		System.out.println("My Height is " + height);
		System.out.println("My Contact No " + contactno);
		System.out.println("My Address is " + address);
	}
}
