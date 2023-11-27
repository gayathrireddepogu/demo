package Task19;

class Removewhitespace {
    public static void main(String[] args)
    {
        String str = "     sight        spectrum     ";
 
        str = str.replaceAll("\\s", "");
 
        System.out.println(str);
    }
}