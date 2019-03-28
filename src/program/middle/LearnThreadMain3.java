package program.middle;

public class LearnThreadMain3 {
	
	public static void main(String[] args) {
		LearnThread3 learnThread3 = new LearnThread3();
		learnThread3.start();
		
		synchronized (learnThread3) {
			
			try {
				System.out.println(">> learnThread3가 종료될 때까지 기다립니다.");
				learnThread3.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(">> learnThread3가 종료되었습니다. " + "total 값은 " + learnThread3.total);
		}
	}

}
