package wallmania;

public class LearnException3 {
	
	public static void main(String[] args) {
		
		LearnException3 learnexception3 = new LearnException3();
		try { learnexception3.firstMethod();
		} catch (Exception e) { e.printStackTrace(); }
	}
	
	// thirdMethod() 에서 Exception 발생시 예외처리를 나를 호출한 곳으로 보내버린다. (to secondMethod())
	// secondMethod() 에서 Exception 발생시 예외처리를 나를 호출한 곳으로 보내버린다. (to firstMethod())
	// firstMethod() 에서 Exception 발생시 예외처리를 나를 호출한 곳으로 보내버린다. (e.printStackTrace() 실)
	public void firstMethod() throws Exception { secondMethod(); }
	public void secondMethod() throws Exception { thirdMethod(); }	
	public void thirdMethod() throws Exception { System.out.println("10 / 0 = " + (10 / 0)); }
}
