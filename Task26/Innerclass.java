package Task26;

class Outer {
 private int outerVariable = 10;

 class Inner {
     private int innerVariable = 5;

     public void display() {
         System.out.println("Outer Variable: " + outerVariable);
         System.out.println("Inner Variable: " + innerVariable);
     }
 }

 static class StaticInner {
     private static int staticInnerVariable = 20;

     public void display() {


         System.out.println("Static Inner Variable: " + staticInnerVariable);
     }
 }
}

public class Innerclass {
 public static void main(String[] args) {

     Outer outerObject = new Outer();

     Outer.Inner innerObject = outerObject.new Inner();
     innerObject.display();

     Outer.StaticInner staticInnerObject = new Outer.StaticInner();
     staticInnerObject.display();
 }
}

