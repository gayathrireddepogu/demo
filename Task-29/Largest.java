package Task29;

public class Largest {  
    public static void main(String[] args) {  
   
        int [] arr = new int [] {25, 11, 7, 75, 56,120,580,670};  
  
        int max = arr[0];  
 
        for (int i = 0; i < arr.length; i++) {  
 
           if(arr[i] > max)  
               max = arr[i];  
        }  
        System.out.println("Largest element present in given array: " + max);  
    }  
} 
