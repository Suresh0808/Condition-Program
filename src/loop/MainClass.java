package loop;

class Vehicle {
	String brand;
	int year;
	
	void startEngine() {
		
	}
}
	
	class Car extends Vehicle {
		String fuelType;
		
		void startEngine() {
			System.out.println("Car engine starts");
		}
		void drive() {
			System.out.println("Car is driving");
		}
	}
	
	class Truck extends Vehicle {
		int loadCapacity;
		
		void startEngine()	{
			System.out.println("Truck engine starts");
		}
		void haul() {
			System.out.println("Truck is hauling");
		}
	
	}

public class MainClass {
	public static void main(String[] args)	{
		
		Car obj = new Car();
		obj.brand = "Kia";
		obj.year = 2024;
		obj.fuelType = "Petrol";
		System.out.println(obj.brand);
		System.out.println(obj.year);
		System.out.println(obj.fuelType);
		obj.startEngine();
		obj.drive();
		System.out.println();
		
		Truck obj1 = new Truck();
		obj1.brand = "Bharat Benz";
		obj1.year = 2023;
		obj1.loadCapacity = 5000;
		System.out.println(obj1.brand);
		System.out.println(obj1.year);
		System.out.println(obj1.loadCapacity);
		obj1.startEngine();
		obj1.haul();
		
	}

}