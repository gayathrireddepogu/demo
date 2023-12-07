package Task26;

abstract class gfg {
    abstract void printInfo();
}

public class Abstract extends gfg {
    void printInfo()
    {
        String name = "Gayathri";
        int age = 20;
        float salary = 33333.2F;
 
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }

 
    public static void main(String args[])
    {
        gfg s = new Abstract();
        s.printInfo();
    }
}
