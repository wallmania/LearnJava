package wallmania;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class J8ClassMain {
	public static void main (String[] args) {
		
		// ClassType1의 객체 생성 (해당 객체 이름은 ClassEx1, ClassEx2)
		ClassType1 ClassEx1 = new ClassType1(); 
		ClassEx1.color = "red"; ClassEx1.gear = "auto"; ClassEx1.price = 100; 
		ClassEx1.run(); ClassEx1.stop(); ClassEx1.info();
		
		System.out.println("");
		
		ClassType1 ClassEx2 = new ClassType1();
		ClassEx2.color = "yellow"; ClassEx2.gear = "auto"; ClassEx2.price = 500; 
		ClassEx2.run(); ClassEx2.stop(); ClassEx2.info();
		
		// 생성자에 정보 입력하는 방법 2가지. 
		ClassType2 ClassEx3 = new ClassType2(); 
		ClassEx3.color = "red"; ClassEx3.price = 100; ClassEx3.info(); 
		ClassEx3.setInfo("blue", 1000); ClassEx3.info();
		
		System.out.println("");
		
		ClassType2 ClassEx4 = new ClassType2("yellow", 500); ClassEx4.info(); 
		ClassEx4.setInfo("black", 10000); ClassEx4.info();
		
		// Overloading Test : (1) method 이름이 같아도 매개변수 다르면 ok (2) method 이름 같은데 매개변수도 같으면 동작 X
		System.out.println("\n[3] Overloading Test");
		System.out.println(">> method 이름이 같아도 매개변수 다르면 ok");
		System.out.println(">> method 이름 같은데 매개변수도 같으면 동작 X");
		ClassEx4.getInfo(); ClassEx4.getInfo(1, 2); ClassEx4.getInfo("a", "b");
		
		// 같은 Class를 통해 객체를 생성 --> 3개의 객체는 서로 다른 메모리 주소에 저장 & 3개의 객체는 서로 다른 객체  
		System.out.println("\n[4] 같은 Class를 통해 객체를 생성 --> 3개의 객체는 서로 다른 메모리 주소에 저장 & 3개의 객체는 서로 다른 객체");
		ClassType3 ClassEx5 = new ClassType3(); 
		ClassType3 ClassEx6 = new ClassType3(); 
		ClassType3 ClassEx7 = new ClassType3();
		System.out.printf(">> ClassEx5 (해당 클래스가 있는 memory 주소는 %s)\n", ClassEx5);
		System.out.printf(">> ClassEx6 (해당 클래스가 있는 memory 주소는 %s)\n", ClassEx6);
		System.out.printf(">> ClassEx7 (해당 클래스가 있는 memory 주소는 %s)\n", ClassEx7);
		System.out.printf(">> Result of Equality, ClassEx5 == ClassEx6 (%b)\n", ClassEx5 == ClassEx6);
		System.out.printf(">> Result of Equality, ClassEx6 == ClassEx7 (%b)\n", ClassEx6 == ClassEx7);
		System.out.printf(">> Result of Equality, ClassEx5 == ClassEx7 (%b)\n", ClassEx5 == ClassEx7);
		
		// reference에 null 저장되면 객체의 연결이 끊기며, 더 이상 객체를 이용할 수 없다.
		System.out.println("\n[5] reference에 null 저장되면 객체의 연결이 끊기며, 더 이상 객체를 이용할 수 없다.");
		System.out.println(">> ClassEx5 가 저장된 곳의 현재 memory 주소는 " + ClassEx5); ClassEx5.getInfo();
		ClassEx5 = null; 
		System.out.println(">> Null로 설정한 후, ClassEx5 가 저장된 곳의 현재 memory 주소는 : " + ClassEx5);
		
		// this 학습. 
		System.out.println("\n[5] this 학습.");
		ClassType4 learnclass4 = new ClassType4(10, 20);
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

class ClassType1 {
	
	// [1] 클래스 이름의 첫글자는 대문자로 한다. 
	// [2] 멤버 변수 (속성)
	public String color; public String gear; public int price; 
	// [3] 생성자. (클래스 이름과 동일한 이름을 가진 method) : 반환하는 내용이 없다. (원하는 color, gear, price 새로 설정해서 새로운 ClassType1 생성 가능.
	public ClassType1() { System.out.print("[1] ClassType1 Type의 객체 생성됨.\n"); }
	
	// method (기능)
	public void run() { System.out.println(">> .run() : ClassType1 Type Class에서 정의된 method"); }
	public void stop() { System.out.println(">> .stop() : class Type Class에서 정의된 method"); }
	public void info() { System.out.printf(">> .info() : color(%s), gear(%s), price(%d)\n", color, gear, price); }
}

class ClassType2 {
	
	public String color; public int price;
	
	public ClassType2() { System.out.print("\n"); System.out.println("[2] ClassType2 Type의 객체 생성됨 w/o param"); }
	public ClassType2(String c, int p) { System.out.println("[2] ClassType2 Type의 객체 생성됨 w/ param"); color = c; price = p; }
	
	public void setInfo(String c, int p) { System.out.println(">> .setInfo() executed"); color = c; price = p; }
	public void info() { System.out.println(">> .info() executed w/ color(" + color + ") " + "price(" + price + ")"); }
	
	// overloading (중복. method) : method 이름이 같아도 매개변수 다르면 ok & method 이름 같은데 매개변수도 같으면 동작 X
	public void getInfo() {  System.out.println(">> overloading(Type 1) : getInfo()"); }
	public void getInfo(int x, int y) { System.out.printf(">> overloading(Type 2) : getInfo() w/ param (x : %d, y : %d)\n", x, y); }
	public void getInfo(String s1, String s2) { System.out.printf(">> overloading(Type 3) : getInfo() w/ param (s1 : %s, s2 : %s)\n", s1, s2); }
	
	// public 으로 선언한 변수, method (외부에서 접근 가능) & private으로 선언한 변수, method (외부에서 접근 불가능) 
	private void getInfo_Private() { System.out.print("\n" + "This is private method"); }
}

class ClassType3 {
	public void getInfo() { System.out.println(">> ClassType3 Type Class의 method, .getInfo() 발동!"); }
}

class ClassType4 {
	public int x1; public int y1; public int x2; public int y2;
	
	public ClassType4(String s, int[] iArr) {
		System.out.println(">> ClassType4 Type 객체 생성 w/ param(String s, int[] iArr)");
		System.out.println("s : " + s); System.out.println("iArr : " + iArr);
	}
	
	// this.x1에서 x1은 LearnClass4에서의 x1 != 매개변수 x1
	// this.y1에서 y1은 LearnClass4에서의 y1 != 매개변수 y1
	public ClassType4(int x1, int y1) {
		System.out.println(">> ClassType4 Type 객체 생성 w/ param(int x1, int y1)");
		this.x1 = x1; this.y1 = y1;
	}
	
	public void getInfo() { System.out.println(">> x1(" + x1 + ") y1(" + y1 + ") x2(" + x2 + ") y2(" + y2 + ")"); }
}
