package Task10;

interface sayable{  
    void say(String msg);  
}  
public class Functionalinterface implements sayable{  
    public void say(String msg){  
        System.out.println(msg);  
    }  
    public static void main(String[] args) {  
        Functionalinterface fie = new Functionalinterface();  
        fie.say("Hello there");  
    }  
}  
