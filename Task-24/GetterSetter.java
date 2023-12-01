package Task24;

public class GetterSetter {
   
    private int myField;

    public int getMyField() {
        return myField;
    }

    public void setMyField(int newValue) {
        this.myField = newValue;
    }

    public static void main(String[] args) {
        GetterSetter myObject = new GetterSetter();

        myObject.setMyField(56);

        int value = myObject.getMyField();
        System.out.println("Value of myField: " + value);
    }
}

