package Enumeration;

public enum Mangos {
		Brooks(10),Manilla(9),Alphanso(12),Kesar(15),Maya(8);
		private int price;
		Mangos(int p)
		{
			this.price=p;
		}
		int getPrice()
		{
			return price;
		}
		
}
