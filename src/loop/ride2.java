package loop;

public class ride2 extends override{

	public void car()	{
		super.car();
		System.out.println("Rs 600");
	}
	public void train()	{
		super.train();
		System.out.println("Rs 600");
	}
	public void flight()	{
		super.flight();
		System.out.println("Rs 600");
	}
	
	public static void main(String[] args)	{
		ride2 obj= new ride2();
		obj.car();
		obj.train();
		obj.flight();
	}
}
