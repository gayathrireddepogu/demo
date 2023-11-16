package Task13;

class MyThread implements Runnable {
    public void run() {
        for (int i = 0; i <+ 5; i++) {
            System.out.println(Thread.currentThread().getId() + " Value " + i);
        }
    }
}


public class Tryresource {
	

	public static void main(String[] args) {
		Thread t1=new Thread(new MyThread());
		Thread t2=new Thread(new MyThread());
		t1.start();
		t2.start();
			
			

	}

}