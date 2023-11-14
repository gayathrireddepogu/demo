package Task10;

abstract class Person{  
	  abstract void eat();  
	}  

public class Annoymous {

	public static void main(String[] args) {
		 Person p=new Person(){  
			  void eat(){System.out.println("nice fruits");}  
			  };  
			  p.eat();

	}

}
