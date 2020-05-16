package Abstraction;

public class Employee {
	
	private int x;
	private String str;
	private double bal;
	private double sal;
	private double credit;
	
	public void display(int a,String name,double balance)
	{
		x=a;
		str=name;
		bal=balance;
		System.out.println("Account no:"+x);
		System.out.println("Customer name:"+str);
		System.out.println("Total balance:$"+bal);
	}

}
