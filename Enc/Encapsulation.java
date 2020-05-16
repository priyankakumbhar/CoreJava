package Enc;

 class Encapsulation {
	
	private String name;
	private String subject;
	public void display(String n,String s)
	{
		this.name=n;
		this.subject=s;
		System.out.println(name+" Doing post-graduation in :"+subject);
	}

}
