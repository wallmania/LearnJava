package wallmania;

public class LearnException {
	public static void main(String[] args) {
		int i = 10; int j = 0; int k = 0;
		
		System.out.println("[1] Exception Before\n");
		
		try {
			k = i / j;
		} catch (Exception e) {
			e.printStackTrace();
			String msg = e.getMessage();
			System.out.println("[2] msg : " + msg);
		}
		
		System.out.println("\n[3] Exception After");
	}

}
