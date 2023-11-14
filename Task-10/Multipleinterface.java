package Task10;

    interface Printable{  
       void print();  
  }  
    interface Showable{  
        void show();  
  }  
       class Multipleinterface implements Printable,Showable{  
           public void print(){System.out.println("Hello");}  
            public void show(){System.out.println("Welcome");}  
  
       public static void main(String args[]){  
            Multipleinterface obj = new Multipleinterface();  
             obj.print();  
             obj.show();  
      }  
}  
