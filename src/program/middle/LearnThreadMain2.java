package program.middle;

public class LearnThreadMain2 {
	
	public static void main(String[] args) {
		
		LearnThread2 t1 = new LearnThread2(">> ");
		LearnThread2 t2 = new LearnThread2("-- ");
		
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);
		
		thread1.start(); thread2.start();
		System.out.println("\nLearnThreadMain2의 main은 종료되었습니다.\n");
	}
	

}
