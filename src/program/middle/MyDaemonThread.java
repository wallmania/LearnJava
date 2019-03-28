package program.middle;

public class MyDaemonThread implements Runnable {
	
	@Override 
	public void run() {
		while(true) {
			System.out.println(">> Deamon Thread 실행 중입니다.");
			
			try { 
				Thread.sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(">> [Main Thread] 시작되었습니다.");
		Thread thread = new Thread(new MyDaemonThread());
		thread.setDaemon(true);
		thread.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
		System.out.println(">> [Main Thread] 종료되었습니다. (Main Thread 종료시 Daemon Thread도 같이 종료됩니다)");
		
		
	}

}
