package Task27;

public class Multithreading {
    public static void main(String[] args) {

        Counter counter = new Counter();

        Thread thread1 = new Thread(new IncrementTask(counter));
        thread1.start();

        Thread thread2 = new Thread(new IncrementTask(counter));
        thread2.start();
    }
}

class Counter {
    private int count = 0;

    public synchronized void increment() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": Count = " + (++count));

            try {

                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class IncrementTask implements Runnable {
    private final Counter counter;

    public IncrementTask(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        counter.increment();
    }
}

