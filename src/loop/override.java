package loop;

public class override {
	public void car()
	{
		System.out.println("Rs 1000");
	}
	public void train()
	{
		System.out.println("Rs 200");
	}
	public void flight()
	{
		System.out.println("Rs 2000");
	}
	
	public static void main(String [] args)	{
		override result= new override();
		result.car();
		result.train();
		result.flight();
	}
}
