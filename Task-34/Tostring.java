package Task34;

public class Tostring{  
	 int rollno;  
	 String name;  
	 String city;  
	  
	 Tostring(int rollno, String name, String city){  
	 this.rollno=rollno;  
	 this.name=name;  
	 this.city=city;  
	 }  
	  
	 public static void main(String args[]){  
	   Tostring s1=new Tostring(101,"Gayu","chennai");  
	   Tostring s2=new Tostring(102,"Chandu","delhi");  
	     
	   System.out.println(s1);
	   System.out.println(s2);  
	 }  
	}  
