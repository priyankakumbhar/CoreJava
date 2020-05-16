package Inheritance;

public class SportPerson extends Person {

	private String Sport;
	
	public String getSport() {
		return Sport;
	}

	public void setSport(String sport) {
		Sport = sport;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         SportPerson sp=new SportPerson();
         sp.setName("Pradeep");
         sp.setSport("football");
         System.out.println("Name of player: "+sp.getName());
         System.out.println("Name of Sport: "+sp.getSport());
         
	}

}
