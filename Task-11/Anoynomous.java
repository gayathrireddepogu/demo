package Task11;

abstract class Person{  
	  abstract void eat();  
	}  
	class Anonynomous{  
	 public static void main(String args[]){  
	  Person p=new Person(){  
	  void eat(){System.out.println("nice fruits");}  
	  };  
	  p.eat();  
	 }  
	}  
