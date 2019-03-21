package wallmania;

public class OuterClass {
	int num = 10;
	String str1 = "java";
	static String str11 = "world";
	public OuterClass() { System.out.println("--OuterClass type의 객체가 생성되었습니다.--"); }
	
	class InnerClass {
		int num = 100;
		String str2 = str1;
		public InnerClass() { System.out.println("--InnerClass type의 객체가 생성되었습니다.--"); }
	}
	
	static class StaticInnerClass {
		int num = 1000;
		String str3 = str11;
		public StaticInnerClass() { System.out.println("--StaticInnerClass type의 객체가 생성되었습니다.--"); }
	}

}
