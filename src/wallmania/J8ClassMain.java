package wallmania;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class J8ClassMain {
	public static void main (String[] args) {
		
		// LearnClass Type의 객체 생성 (해당 객체 이름은 ExClass_1st, ExClass_2nd)
		LearnClass1 ExClass_1st = new LearnClass1(); 
		ExClass_1st.color = "red"; ExClass_1st.gear = "auto"; ExClass_1st.price = 100;
		ExClass_1st.run(); ExClass_1st.stop(); ExClass_1st.info();
		LearnClass1 ExClass_2nd = new LearnClass1();
		ExClass_2nd.color = "yellow"; ExClass_2nd.gear = "auto"; ExClass_2nd.price = 500;
		ExClass_2nd.run(); ExClass_2nd.stop(); ExClass_2nd.info();
		
		// 생성자에 정보 입력하는 방법 2가지. (+ Class의 method 사)
		LearnClass2 ExClass_3rd = new LearnClass2(); ExClass_3rd.color = "red"; ExClass_3rd.price = 100; ExClass_3rd.info();
		ExClass_3rd.setInfo("blue", 1000); ExClass_3rd.info();
		System.out.println("");
		LearnClass2 ExClass_4th = new LearnClass2("yellow", 500); ExClass_4th.info();
		ExClass_4th.setInfo("black", 10000); ExClass_4th.info();

		// Overloading Test
		// method 이름이 같아도 매개변수 다르면 ok -> method 이름 같은데 매개변수도 같으면 동작 X
		System.out.println("");
		ExClass_4th.getInfo();
		ExClass_4th.getInfo(1, 2);
		ExClass_4th.getInfo("a", "b");
		
		// 같은 Class를 통해 객체를 생성했지만 3개의 객체는 서로 다른 메모리 주소에 저장된다. 
		// 같은 Class를 통해 객체를 생성했지만 3개의 객체는 서로 다른 객체이다. 
		LearnClass3 ExClass_5th = new LearnClass3(); LearnClass3 ExClass_6th = new LearnClass3(); LearnClass3 ExClass_7th = new LearnClass3();
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
		System.out.println("\n" + "ExClass_5th : " + ExClass_5th); ExClass_5th.getInfo();
		ExClass_5th = null; 
		System.out.println("ExClass_5th : " + ExClass_5th);
		// ExClass_5th.getInfo();
		
		// this 학습. 
		System.out.println("");
		LearnClass4 learnclass4 = new LearnClass4(10, 20);
		learnclass4.getInfo();
		
		
		// -- File 입출력 Code -- System.out.println("Working Directory = " + System.getProperty("user.dir"));
		FileInputStream fis = null; FileOutputStream fos = null;
		try {
			fis = new FileInputStream("/Users/junlee/Java/workspace/LearnJava/src/wallmania/J8ClassMain.java");
			fos = new FileOutputStream("/Users/junlee/Java/workspace/LearnJava/src/wallmania/J8ClassMain.txt");
			int readData = -1; while((readData = fis.read()) != -1) { fos.write(readData); }
		} catch (Exception e) {  e.printStackTrace();
		} finally { try { fos.close(); } catch (Exception e) { e.printStackTrace(); } }
	}
}
