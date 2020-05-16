package Polymorphism;

public class A {
	 void calc(double x)
	{
		System.out.println("Square of the given no: "+(x*x));
	}

}
class B extends A {
	 void calc(double x)
	{
		double y=5;
		System.out.println("Square of the given no: "+(x*y));
	}

}

