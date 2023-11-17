package Task13;

public class Threadstate {

    public static void main(String[] args) {
        // Create a new thread
        Thread myThread = new Thread(() -> {
            // Thread logic goes here
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Print the initial state of the thread
        System.out.println("Initial State: " + myThread.getState());

        // Start the thread
        myThread.start();

        // Print the state after starting the thread
        System.out.println("After start(): " + myThread.getState());

        // Wait for the thread to finish
        try {
            myThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final state after the thread has finished
        System.out.println("After join(): " + myThread.getState());
    }
}
