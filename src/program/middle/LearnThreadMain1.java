package program.middle;

public class LearnThreadMain1 {
	
	public static void main(String[] args) {
		
		LearnThread1 t1 = new LearnThread1(">> LearnThread1 (extends Thread)");
		LearnThread1 t2 = new LearnThread1("-- LearnThread1 (extends Thread)");
		
		t1.start(); t2.start();
		System.out.println("\n$ LearnThreadMain1의 main은 종료되었습니다.\n$ main을 마지막에 종료시키기 위해 상태제어(join) 해줘야 합니다.\n");
	}
}
