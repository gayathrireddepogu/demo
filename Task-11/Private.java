package Task11;

class A{  
int data=40;  
void msg(){System.out.println("Hello java");}  
}  
  
public class Private{  
 public static void main(String args[]){  
   A obj=new A();  
   System.out.println(obj.data);//Compile Time Error  
   obj.msg();//Compile Time Error  
   }  
}
