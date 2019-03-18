package wallmania;

import wallmania2.LearnClass_This;
import wallmania2.EmployeeBank;
import wallmania2.Studnet_Info;
// 해당 패키지 안에 있는 모든 class를 import 하려면 * 를 쓰도록 하자.
// import wallmania2.*;

public class LearnPackage_Static {
	// java 프로그램은 많은 클래스로 구성되고, 이러한 클래스를 폴더 형식으로 관리하는 것을 패키지라고 한다.
	// 패키지 이름은 패캐지에 속해 있는 클래스가 최대한 다른 클래스와 중복되는 것을 방지하도록 만든다.
	// 패키지 이름은 일반적으로 도메인을 거꾸로 이용한다. 
	// 개발 중에 패캐지 이름과 구조는 변경될 수 있다. 
	// 패키지 이름만 보고도 해당 패키지 안에 있는 클래스가 어떤 속성과 기능을 가지고 있는지 예상할 수 있도록 이름을 짓는다.
	
	public static void main(String[] args) {
		LearnClass_This learnclass_this = new LearnClass_This(10, 20);
		learnclass_this.getInfo();
		System.out.print("\n\n");
		
		// parkBank.saveMoney(100) -> amount = 100 이다. 
		EmployeeBank parkBank = new EmployeeBank("park"); parkBank.saveMoney(100); parkBank.getBankInfo();
		// leeBank.saveMoney(300) -> amount = 100 + 300 이다. (static 변수라서 두 객체가 하나의 변수를 공유한다)
		EmployeeBank leeBank = new EmployeeBank("lee"); leeBank.saveMoney(300); leeBank.getBankInfo();
		// parkBank.spendMoney(400) -> amount = 100 + 300 - 400 이다. (static 변수라서 두 객체가 하나의 변수를 공유한다)
		parkBank.spendMoney(400);
		// 결국 amount = 0 
		leeBank.getBankInfo();
		System.out.print("\n\n");
		
		Studnet_Info student1 = new Studnet_Info("Hong", 90);
		student1.getInfo();
		student1.setScore(100); student1.getInfo();
		student1.setScore(50); student1.getInfo();
	}
}
