package program.middle;

public class LearnThread2 implements Runnable {
	
	String str;
	public LearnThread2(String str) {
		this.str = str;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(i + "th " + str + " is printed.");
			try {
				long TimeStart = System.currentTimeMillis();
				Thread.sleep( (int) (Math.random()*1000) );
				long TimeEnd = System.currentTimeMillis();
				long DeltaT = TimeEnd - TimeStart;
				System.out.println("time sleeped w/ Δt = " + (float) DeltaT / 1000 + "s");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
