package Task11;

class Parents {   
    String name;   
   
    void showMessage()   
    {   
        System.out.println("Parent method is called");   
    }   
}   
     
class Children extends Parents {   
    int age;       
   
    void showMessage()   
    {   
        System.out.println("Child method is called");   
    }   
}     
public class Downcasting{  
    
    public static void main(String[] args)   
    {   
        Parents p = new Children();  
        p.name = "Gayathri";  
          
        Children c = (Children)p;   
    
        c.age = 18;   
        System.out.println(c.name);   
        System.out.println(c.age);   
        c.showMessage();   
    }   
}  
