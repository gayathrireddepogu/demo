package Task28;

public class Threadstate {
    public static void main(String[] args) {
        Thread myThread = new Thread(() -> {
            try {
                Thread.sleep(1000);
                synchronized (Threadstate.class) {
                    Threadstate.class.wait(); 
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        System.out.println("Thread State: " + myThread.getState()); 

        myThread.start();
        System.out.println("Thread State after start(): " + myThread.getState()); 

        try {

            Thread.sleep(500);
            System.out.println("Thread State before join(): " + myThread.getState()); 
            myThread.join(); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread State after join(): " + myThread.getState());
    }
}

