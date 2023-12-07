package Task26;
enum Color {
 RED, GREEN, BLUE;
}

public class Enum {
 public static void main(String[] args) {
 
     Color c1 = Color.RED;
     Color c2 = Color.GREEN;
     Color c3 = Color.BLUE;

     System.out.println("Color 1: " + c1);  
     System.out.println("Color 2: " + c2);  
     System.out.println("Color 3: " + c3);  

     switch (c1) {
         case RED:
             System.out.println("The color is red.");
             break;
         case GREEN:
             System.out.println("The color is green.");
             break;
         case BLUE:
             System.out.println("The color is blue.");
             break;
         default:
             System.out.println("Unknown color.");
     }

     System.out.println("All Colors:");
     for (Color color : Color.values()) {
         System.out.println(color);
     }
 }
}
