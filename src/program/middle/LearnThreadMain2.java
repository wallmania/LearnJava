package program.middle;

public class LearnThreadMain2 {
	
	public static void main(String[] args) {
		
		LearnThread2 t1 = new LearnThread2(">> LearnThread2 (implements Runnable)");
		LearnThread2 t2 = new LearnThread2("-- LearnThread2 (implements Runnable)");
		
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);
		
		thread1.start(); thread2.start();
		System.out.println("\n$ LearnThreadMain2의 main은 종료되었습니다.\n$ main을 마지막에 종료시키기 위해 상태제어(join) 해줘야 합니다.\n");
	}
}
