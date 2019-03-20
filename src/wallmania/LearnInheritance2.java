package wallmania;

public class LearnInheritance2 {
	public static void main(String[] args) {
		
		// 모든 class의 최상위 class는 Object Class 이다. 
		// Class도 Type 이다. 
		// 배열에 담기는 객체 Type (int, String, ...) 은 모두 같아야 한다.  		
		LearnParentClass[] pArr = new LearnParentClass[2];
		
		LearnParentClass ch2 = new LearnChildClass2(); // LearnChildClass2 ch2 = new LearnChildClass2();
		LearnParentClass ch3 = new LearnChildClass3(); // LearnChildClass3 ch2 = new LearnChildClass3();
		
		// override 가능하다. 
        // 부모 Class가 가지고 있는 method와 동일한 method 이름이되 기능을 수정한 것 
        // 본인 Class 변수 접근할때는 this.{변수이름}, 부모 Class 변수 접근할때는 super.{변수이름}, 
		pArr[0] = ch2; pArr[1] = ch3;
		ch2.overRideFunc(); ch3.overRideFunc(); 
	}
}
