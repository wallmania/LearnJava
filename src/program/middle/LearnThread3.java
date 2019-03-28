package program.middle;

public class LearnThread3 extends Thread{
	
	int total;
	
	public void run() {
		synchronized (this) {
			for (int i=0; i<10; i++) {
				System.out.print(">> " + i + " is added");
				total += i;
				System.out.println("and total = " + total);
				try { Thread.sleep(250); } catch (InterruptedException e) { e.printStackTrace(); }
			}
			notify();
		}
	}

}
