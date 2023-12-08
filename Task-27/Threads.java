package Task27;

public class Threads extends Thread {  
     
    public void run()  
    {    
       int a= 10;  
       int b=12;  
       int result = a+b;  
       System.out.println("Thread started running..");  
       System.out.println("Sum of two numbers is: "+ result);  
    }  
    public static void main( String args[] )  
    {  
   
       Threads t1 = new  Threads();  
 
       t1.start();  
    }  
}  
