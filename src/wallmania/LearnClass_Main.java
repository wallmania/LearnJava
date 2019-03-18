package wallmania;

public class LearnClass_Main {
	public static void main (String[] args) {
		LearnClass ExClass_1st = new LearnClass();
		ExClass_1st.color = "red"; ExClass_1st.gear = "auto"; ExClass_1st.price = 100;
		ExClass_1st.run(); ExClass_1st.stop(); ExClass_1st.info();
		
		LearnClass ExClass_2nd = new LearnClass();
		ExClass_2nd.color = "yellow"; ExClass_2nd.gear = "auto"; ExClass_2nd.price = 500;
		ExClass_2nd.run(); ExClass_2nd.stop(); ExClass_2nd.info();
		
		// 생성자에 정보 입력하는 방법 2가지.
		LearnClass2 ExClass_3rd = new LearnClass2(); ExClass_3rd.color = "red"; ExClass_3rd.price = 100; ExClass_3rd.info();
		LearnClass2 ExClass_4th = new LearnClass2("yellow", 500); ExClass_4th.info();
		
		// Class의 method 사용 
		ExClass_3rd.setInfo("blue", 1000); ExClass_3rd.info();
		ExClass_4th.setInfo("black", 10000); ExClass_4th.info();
		
		// Overloading Test
		ExClass_4th.getInfo();
		ExClass_4th.getInfo(1, 2);
		ExClass_4th.getInfo("a", "b");
		
	}

}
