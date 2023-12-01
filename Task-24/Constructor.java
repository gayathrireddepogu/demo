package Task24;

public class Constructor {
   
    private int myField;

    public Constructor(int initialValue) {
        this.myField = initialValue;
    }

    public int getMyField() {
        return myField;
    }

    public void setMyField(int newValue) {
        this.myField = newValue;
    }

    public static void main(String[] args) {
  
        Constructor myObject = new Constructor(42);

        int value = myObject.getMyField();
        System.out.println("Value of myField: " + value);

        myObject.setMyField(55);
        System.out.println("Updated value of myField: " + myObject.getMyField());
    }
}

