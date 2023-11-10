package Java;
class Emp{  
	 float salary=40000;  
	}  

public class Employee extends Emp{  
	 int bonus=10000;  
	 public static void main(String args[]){  
	   Employee p=new Employee();  
	   System.out.println("Programmer salary is:"+p.salary);  
	   System.out.println("Bonus of Programmer is:"+p.bonus);  
	 }
	
	}  
