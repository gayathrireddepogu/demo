package Java;
class Program{  
void eat(){System.out.println("eating...");}  
}  
class Code extends Program{  
void bark(){System.out.println("barking...");}  
}  
class BabyDog extends Code{  
void weep(){System.out.println("weeping...");}  
}

public class Multiinheritance {

	public static void main(String[] args) {
		BabyDog d=new BabyDog();  
		d.weep();  
		d.bark();  
		d.eat();

	}

}
