package Task32;

public class Switchsta {
    public static void main(String[] args) {
        int directions = 3;

        switch (directions) {
            case 1:
                System.out.println("East");
                break;
            case 2:
                System.out.println("West");
                break;
            case 3:
                System.out.println("North");
                break;
            case 4:
                System.out.println("South");
                break;
            default:
                System.out.println("Invalid direction");
        }
    }
}
