package Task11;

abstract class Vehicle  
{  
    abstract void bike();  
      
}  
class Honda extends Vehicle  
{  
  
    @Override  
    void bike() {  
        System.out.println("Bike is running");  
      
    }  
      
}  
  
public class Abstract {  
  
    public static void main(String[] args) {  
  
    Honda obj=new Honda();  
    obj.bike();  
    }         
}  
