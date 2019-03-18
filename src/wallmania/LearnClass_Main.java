package wallmania;

public class LearnClass_Main {
	public static void main (String[] args) {
		LearnClass ExClass_1st = new LearnClass();
		ExClass_1st.color = "red";
		ExClass_1st.gear = "auto";
		ExClass_1st.price = 100;
		
		ExClass_1st.run();
		ExClass_1st.stop();
		ExClass_1st.info();
		
		LearnClass ExClass_2nd = new LearnClass();
		ExClass_2nd.color = "yellow";
		ExClass_2nd.gear = "auto";
		ExClass_2nd.price = 500;
		
		ExClass_2nd.run();
		ExClass_2nd.stop();
		ExClass_2nd.info();
		
		System.out.print("\n\n");
		
		LearnClass2 ExClass_3rd = new LearnClass2(); ExClass_3rd.color = "red"; ExClass_3rd.price = 100; ExClass_3rd.info();
		System.out.print("\n");
		LearnClass2 ExClass_4th = new LearnClass2("yellow", 500); ExClass_4th.info();
		
	}

}
