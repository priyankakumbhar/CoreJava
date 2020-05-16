package Inheritance;

public class Car extends Vehicle {
   
	public double calculate()
	{
		double x;
		x=super.calculate();
		System.out.println("Speed of the vehicle is: " +x+ "km/hr");
		return x;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		c.calculate();

	}

}
