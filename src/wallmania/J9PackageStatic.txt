package wallmania;

import java.io.FileInputStream;
import java.io.FileOutputStream;

// 해당 패키지 안에 있는 모든 class를 import 하려면 * 를 쓰도록 하자.
// import wallmania.*;

public class J9PackageStatic {
	// java 프로그램은 많은 클래스로 구성되고, 이러한 클래스를 폴더 형식으로 관리하는 것을 패키지라고 한다.
	// 패키지 이름은 패캐지에 속해 있는 클래스가 최대한 다른 클래스와 중복되는 것을 방지하도록 만든다.
	// 패키지 이름은 일반적으로 도메인을 거꾸로 이용한다. 
	// 개발 중에 패캐지 이름과 구조는 변경될 수 있다. 
	// 패키지 이름만 보고도 해당 패키지 안에 있는 클래스가 어떤 속성과 기능을 가지고 있는지 예상할 수 있도록 이름을 짓는다.
	
	public static void main(String[] args) {
		
		EmployeeBank parkBank = new EmployeeBank("park"); 
		parkBank.saveMoney(100); parkBank.getBankInfo();

		EmployeeBank leeBank = new EmployeeBank("lee"); 
		leeBank.saveMoney(300); leeBank.getBankInfo();
		
		// parkBank.spendMoney(400) 
		// amount = 100 + 300 - 400 이다. (static 변수라서 두 객체가 하나의 변수를 공유한다) --> 결국 amount = 0 
		parkBank.spendMoney(400); leeBank.getBankInfo();
		System.out.print("\n");
		
		StudnetInfo student1 = new StudnetInfo("Hong", 90); student1.getInfo();
		student1.setScore(100); student1.getInfo();
		student1.setScore(50); student1.getInfo();
		
		
		// -- File 입출력 Code -- System.out.println("Working Directory = " + System.getProperty("user.dir"));
		FileInputStream fis = null; FileOutputStream fos = null;
		try {
			fis = new FileInputStream("/Users/junlee/Java/workspace/LearnJava/src/wallmania/J9PackageStatic.java");
			fos = new FileOutputStream("/Users/junlee/Java/workspace/LearnJava/src/wallmania/J9PackageStatic.txt");
			int readData = -1; while((readData = fis.read()) != -1) { fos.write(readData); }
		} catch (Exception e) {  e.printStackTrace();
		} finally { try { fos.close(); } catch (Exception e) { e.printStackTrace(); } }
	}
}

class EmployeeBank {
	
	String name;
	static int amount = 0;
	
	// this.name의 name은 EmployeeBank라는 Class의 name 
	// name은 매개변수 name
	public EmployeeBank(String name) { this.name = name; }
	public void saveMoney(int money) { 
		amount += money; 
		System.out.println(">> $" + money +" is saved and amount = " + amount); 
	}
	public void spendMoney(int money) { 
		amount -= money; 
		System.out.println(">> $" + money + " is spent and amount = " + amount); 
	}
	public void getBankInfo() { System.out.println(">> Employee Name(" + this.name + ") & amount(" + amount + ")"); }

}

class StudnetInfo {
	
	// 외부에서 학생의 이름, 점수 변경하지 못하게 하도록 private 변수로 선언하도록 하자.
	private String name; private int score;
	
	public StudnetInfo(String n, int s) { 
		this.name = n; 
		this.score = s; 
	}
	
	public void getInfo() { System.out.println(">> .getInfo() method 발동! : name(" + name + ") & score(" + score + ")"); }

	// 자동으로 getter, setter 생성하기
	// 마우스 우클릭 -> Source -> Generate getter and setter
	public String getName() { return name; }
	
	// 이름은 외부에서 절대 수정하지 못하게 하기 위해 주석 처리 
	//public void setName(String name) { this.name = name; }
	public int getScore() { return score; }
	
	// 점수는 외부에서 변경 가능하지만 50점보다 큰 경우에만 수정 가능하도록 설정
	// 단순히 score 변수를 Public으로 선언한다면 위와 같은 제약을 걸어줄 수 없
	public void setScore(int score) { if(score > 50) { this.score = score; } } 
}
