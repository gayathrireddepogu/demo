package Task13;

public class Trypri extends Thread {
	public void run() {
		System.out.println("Inside the run() method");
	}

	public static void main(String[] args) {
		Thread.currentThread().setPriority(7);
		System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());  
		  
		 		Trypri th1 = new Trypri();  
		  
		 
		System.out.println("Priority of the thread th1 is : " + th1.getPriority());  
		

	}

}
