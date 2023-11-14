package Task9;

class mobile {
	String Brand;
	int Price;
	static String Name;
	
	public void show() {
		System.out.println(Brand + ":"+ Price +":"+ Name);
	}
}

public class Static {

	public static void main(String[] args) {
		mobile obj1 =new mobile();
		obj1.Brand = "Apple";
		obj1.Price = 15000;
		mobile.Name = "Smartphone";
		
		mobile obj2 =new mobile();
		obj2.Brand = "Vivo";
		obj2.Price = 23000;
		mobile.Name = "Smartphone";
		
		
		
		mobile.Name="phone";
		
		obj1.show();
		obj2.show();
		

	}

}
