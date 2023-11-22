package Task16;

import java.io.*;

class Evenodd {
      
   
    static boolean countEvenOdd(int n) {
        
        int even_count = 0; 
        int odd_count = 0; 
        while (n > 0) {
            int rem = n % 10; 
            
            if (rem % 2 == 0){ 
                even_count++; 
            } 
           
            else { 
                odd_count++; 
            } 
            n = n / 10; 
        } 
        System.out.println("Even count : " + even_count); 
        System.out.println("Odd count : " + odd_count); 
        
        return (even_count % 2 == 0 && odd_count % 2 != 0);
    } 
  
   
    public static void main(String[] args) { 
        int n = 2335453; 
       
        boolean result = countEvenOdd(n); 
      
        if (result) { 
            System.out.println("YES"); 
        } else { 
            System.out.println("NO"); 
        } 
    } 
}

