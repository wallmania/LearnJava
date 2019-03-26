package program.middle;

public class ObejctOverride1 {
	
	String name;
	String number;
	int birthYear;
	
	@Override
	public String toString() {
		return "ObejctOverride [name=" + name + ", number=" + number + ", birthYear=" + birthYear + "]";
	}
	
	public static void main(String[] args) {
		ObejctOverride1 ex1 = new ObejctOverride1();
		ex1.name = "홍길동"; ex1.number = "1234"; ex1.birthYear = 1995;  
		
		ObejctOverride1 ex2 = new ObejctOverride1();
		ex2.name = "홍길동"; ex2.number = "1234"; ex2.birthYear = 1995;
		
		System.out.println("-- 두 객체는 type이 같아도 엄연히 다른 객체이므로 서로 같지 않다.");
		if (ex1.equals(ex2)) {
			System.out.printf(">> ex1 == ex2 w/ hashcode ex1(%s) & ex2(%s)", ex1.hashCode(), ex2.hashCode());
			System.out.print("\n\n");
		} else {
			System.out.printf(">> ex1 != ex2 w/ hashcode ex1(%s) & ex2(%s)", ex1.hashCode(), ex2.hashCode());
			System.out.print("\n\n");
		}
		
		System.out.println("$ ObejctOverride라는 객체를 override(재정의) + 출력하면 다음과 같다.");
		System.out.println(">> " + ex1 + " --> (그냥 객체를 출력.)");
		System.out.println(">> " + ex1.toString() + " --> (.toString()이라는 method 이용해서 출력.)");
		System.out.println(">> " + ex2 + " --> (그냥 객체를 출력.)");
		System.out.println(">> " + ex2.toString() + " --> (.toString()이라는 method 이용해서 출력.)");
	}

	

}
