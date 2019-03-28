package program.middle;

public class LearnThreadMain1 {
	
	public static void main(String[] args) {
		
		LearnThread1 t1 = new LearnThread1(">>");
		LearnThread1 t2 = new LearnThread1("--");
		
		t1.start(); t2.start();
		System.out.println("\nLearnThreadMain1의 main은 종료되었습니다.\n");  
	}

}
