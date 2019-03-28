package program.middle;

public class LearnThread2 implements Runnable {
	
	String str;
	public LearnThread2(String str) { this.str = str; }
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(str + " is printed (" + i + ")");
			try { Thread.sleep(250); } catch (InterruptedException e) { e.printStackTrace(); }
		}
	}
}
