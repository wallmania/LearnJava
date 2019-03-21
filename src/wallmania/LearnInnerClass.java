package wallmania;

public class LearnInnerClass { 

		public static void main (String[] args) {
			
			System.out.println("------------------------------------설명.--------------------------------------");
			System.out.println(">> [1-1] InnerClass 개념은 실무에서 많이 쓰이지 않는다.");
			System.out.println(">> [1-2] 클래스 안에 또 다른 클래스를 생성하는 것으로 이렇게 하면 두 클래스의 멤버에 쉽게 접근할 수 있다.");
			System.out.println("");
			System.out.println(">> [2-1] Anonymous Class는 다음과 같이 정의하지 않는다 --> LearnAnonymousClass ac = new LearnAnonymousClass()");
			System.out.println(">> [2-2] Anonymous Class는 다음과 같이 정의한다 --> new LearnAnonymousClass()");
			System.out.println(">> [2-3] Anonymous Class의 method는 다음과 같이 실행한다 --> new LearnAnonymousClass() {...}.method();");
			System.out.println(">> [2-3] Anonymous Class의 method는 Override가 가능하다.");
			System.out.println("------------------------------------------------------------------------------"  + "\n");
			
			OuterClass oc = new OuterClass();
			System.out.printf(">> oc.num(%d), oc.str1(%s)", oc.num, oc.str1);
			System.out.print("\n\n");
			
			// 멤버 inner class
			OuterClass.InnerClass in = oc.new InnerClass();
			System.out.printf(">> in.num(%d), in.str2(%s)", in.num, in.str2);
			System.out.print("\n\n");
			
			// static inner class
			OuterClass.StaticInnerClass sin = new OuterClass.StaticInnerClass();
			System.out.printf(">> s1.num(%d), s1.str3(%s)", sin.num, sin.str3);
			System.out.print("\n\n");		
			
			// 익명(anonymous) class
			new LearnAnonymousClass() {}.method();
			System.out.println("");	
			new LearnAnonymousClass() {
				@Override
				public void method() { System.out.println(">> LearnAnonymousClass.method()를 Override해서 실행할 수 있습니다."); };
			}.method();
		}
}
