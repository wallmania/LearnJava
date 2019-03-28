package program.middle;

public class MyMusicBox3 {
	public void playMusicA() {
		for(int i=0; i<10; i++) {
			System.out.println(">> Music Type A is ringing! (" + i + ")");
			try { Thread.sleep(250); } catch (InterruptedException e) { e.printStackTrace(); }
		}
	}
	public synchronized void playMusicB() {
		for(int i=0; i<10; i++) {
			System.out.println(">> Music Type B is ringing! (" + i + ")");
			try { Thread.sleep(250); } catch (InterruptedException e) { e.printStackTrace(); }
		}
	}
	public void playMusicC() {
		for(int i=0; i<10; i++) {
			synchronized(this) {
				System.out.println(">> Music Type C is ringing! (" + i + ")");
			}
			try { Thread.sleep(250); } catch (InterruptedException e) { e.printStackTrace(); }
		}
	}
}
