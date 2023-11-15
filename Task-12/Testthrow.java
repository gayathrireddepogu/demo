package Task12;

public class Testthrow {   
     
    public static void validate(int age) {  
        if (age < 18) {  
            throw new IllegalArgumentException("Person is not eligible to vote");    
        } else {  
            System.out.println("Person is eligible to vote!!");  
        }  
    }  
    
    public static void main(String[] args) {  
        try {
            validate(13);  
            System.out.println("Rest of the code...");    
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            // Handle the exception or perform any necessary actions
        }
    }    
}
