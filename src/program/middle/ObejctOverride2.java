package program.middle;

public class ObejctOverride2 {
	
	String name;
	String number;
	int birthYear;
	
	@Override
	public String toString() {
		return "ObejctOverride [name=" + name + ", number=" + number + ", birthYear=" + birthYear + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObejctOverride2 other = (ObejctOverride2) obj;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}

	public static void main(String[] args) {
		ObejctOverride2 ex1 = new ObejctOverride2();
		ex1.name = "홍길동"; ex1.number = "1234"; ex1.birthYear = 1995;  
		
		ObejctOverride2 ex2 = new ObejctOverride2();
		ex2.name = "홍길동"; ex2.number = "1234"; ex2.birthYear = 1995;
		
		System.out.println("\n" + "$ 두 객체는 type이 같아도 엄연히 다른 객체이므로 서로 같지 않다.");
		System.out.println("$ 두 객체의 학번이 같으면 같은 객체라고 해줄 수 있을까?");
		System.out.println("$ hashCode를 override해서 재정의하기 (ex) 학번만 이용해서 hashCode 만들기.)");
		System.out.println("$ 서로 다른 두 객체의 학번이 같으면 --> hashCode 값이 같으므로 --> 같은 객체가 된다.)");
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
