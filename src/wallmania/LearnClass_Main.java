package wallmania;

public class LearnClass_Main {
	public static void main (String[] args) {
		
		// LearnClass Type의 객체 생성 (해당 객체 이름은 ExClass_1st, ExClass_2nd)
		LearnClass ExClass_1st = new LearnClass(); LearnClass ExClass_2nd = new LearnClass();
		ExClass_1st.color = "red"; ExClass_1st.gear = "auto"; ExClass_1st.price = 100;
		ExClass_2nd.color = "yellow"; ExClass_2nd.gear = "auto"; ExClass_2nd.price = 500;
		ExClass_1st.run(); ExClass_1st.stop(); ExClass_1st.info();
		ExClass_2nd.run(); ExClass_2nd.stop(); ExClass_2nd.info();
		
		// 생성자에 정보 입력하는 방법 2가지.
		LearnClass2 ExClass_3rd = new LearnClass2(); ExClass_3rd.color = "red"; ExClass_3rd.price = 100; ExClass_3rd.info();
		LearnClass2 ExClass_4th = new LearnClass2("yellow", 500); ExClass_4th.info();
		
		// Class의 method 사용 
		ExClass_3rd.setInfo("blue", 1000); ExClass_3rd.info();
		ExClass_4th.setInfo("black", 10000); ExClass_4th.info();
		
		// Overloading Test
		// method 이름이 같아도 매개변수 다르면 ok -> method 이름 같은데 매개변수도 같으면 동작 X
		System.out.println("");
		ExClass_4th.getInfo();
		ExClass_4th.getInfo(1, 2);
		ExClass_4th.getInfo("a", "b");
		
		// 같은 Class를 통해 객체를 생성했지만 3개의 객체는 서로 다른 메모리 주소에 저장된다. 
		// 같은 Class를 통해 객체를 생성했지만 3개의 객체는 서로 다른 객체이다. 
		LearnClass3 ExClass_5th = new LearnClass3();
		LearnClass3 ExClass_6th = new LearnClass3();
		LearnClass3 ExClass_7th = new LearnClass3();
		System.out.print("\n" + "ExClass_5th : " + ExClass_5th);
		System.out.print("\n" + "ExClass_6th : " + ExClass_6th);
		System.out.print("\n" + "ExClass_7th : " + ExClass_7th);
		System.out.println("");
		
		if(ExClass_5th == ExClass_6th) { 
			System.out.println("ExClass_5th == ExClass_6th");
		} else {
			System.out.println("ExClass_5th != ExClass_6th");
		}
		if(ExClass_6th == ExClass_7th) { 
			System.out.println("ExClass_6th == ExClass_7th");
		} else {
			System.out.println("ExClass_6th != ExClass_7th");
		}
		if(ExClass_5th == ExClass_7th) { 
			System.out.println("ExClass_5th == ExClass_7th");
		} else {
			System.out.println("ExClass_5th != ExClass_7th");
		}
		
		// reference에 null 저장되면 객체의 연결이 끊기며, 더 이상 객체를 이용할 수 없다. 
		System.out.println("");
		System.out.println("ExClass_5th --> " + ExClass_5th);
		ExClass_5th.getInfo();
		ExClass_5th = null;
		System.out.println("ExClass_5th --> " + ExClass_5th);
		// ExClass_5th.getInfo();
		
		
		
	}

}
