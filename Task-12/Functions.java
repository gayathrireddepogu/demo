package Task12;

interface Writable
{  
 void write(String txt);  
}  
    
public class Functions implements Writable
 {  
        public void write(String txt)
     {  
         System.out.println(txt);  
     }  
      
  public static void main(String[] args)
  {  
     Functions obj = new Functions();  
     obj.write(" hello welcome  ");  
  }  
}