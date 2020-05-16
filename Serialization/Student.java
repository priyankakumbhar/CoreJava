package Serialization;

import java.io.Serializable;

public class Student implements Serializable {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	 String name;
	 int age;
	
	public Student(int id,String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	

}
