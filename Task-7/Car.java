package Java;

public class Car {
	int id;
	String name; 
	void display(){System.out.println(id+" "+name);} 
	

	public static void main(String[] args) {
		Car s1=new Car();  
		Car s2=new Car();  
		//displaying values of the object  
		s1.display();  
		s2.display(); 
		

	}

}
