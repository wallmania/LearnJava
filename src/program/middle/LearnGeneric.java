package program.middle;

public class LearnGeneric {
	
	// LearnGeneric에 InnerClass Box1 선언.
	public class Box1 {
		private Object obj;
		public void setObj(Object obj) {
			this.obj = obj;
		}
		public Object getObj() {
			return obj; 
		}
	}
	
	// LearnGeneric에 InnerClass Box2 선언.
	// 가상 클래스 E를 사용한다. (= Generic을 사용했다)
	// Object 대신에 E를 쓴다.
	public class Box2<E> {
		private E obj;
		public void setObj(E obj) {
			this.obj = obj;
		}
		public E getObj() {
			return obj; 
		}
	}
	
	// main 
	public static void main(String[] args) {
		
		System.out.println("");
		// LearnGeneric type 객체 LG1를 선언. 
		LearnGeneric LG1 = new LearnGeneric();
		
		// LearnGeneric의 내부 Class Box1을 type으로 가지는 객체 box1 선언. 
		LearnGeneric.Box1 box1 = LG1.new Box1();
		box1.setObj(new Object());
		Object obj1 = box1.getObj();
		System.out.println("$ box1 : " + box1);
		System.out.println("$ obj1 : " + obj1);
		System.out.println("");
		
		// 형 변환을 해주어야 한다. ([1] String, [2] int)
		box1.setObj("hello"); String str1 = (String)box1.getObj();
		box1.setObj(1); int value1 = (int)box1.getObj();
		System.out.println("$ 형 변환을 해주어야 한다. ([1] String, [2] int)");
		System.out.println("$ box1.setObj(\"hello\");");
		System.out.println("$ String str1 = (String)box1.getObj();");
		System.out.println("$ box1.setObj(1);");
		System.out.println("$ int value1 = (int)box1.getObj();");
		System.out.printf(">> str1(%s), value1(%d)\n\n", str1, value1);
		
		// LearnGeneric type 객체 LG2를 선언.  
		LearnGeneric LG2 = new LearnGeneric();
		
		// LearnGeneric의 내부 Class Box2을 type으로 가지는 객체 box2 선언.
		LearnGeneric.Box2<Object> box2 = LG2.new Box2<>();
		box2.setObj(new Object());
		Object obj2 = box2.getObj();
		System.out.println("$ box2 : " + box2);
		System.out.println("$ obj2 : " + obj2);
		System.out.println("");
		
		// Generic 사용함으로써 형변환 할 필요 없다.
		LearnGeneric.Box2<String> box3 = LG2.new Box2<>(); box3.setObj("hello"); String str3 = box3.getObj(); 
		LearnGeneric.Box2<Integer> box4 = LG2.new Box2<>(); box4.setObj(4); int value4 = box4.getObj(); 
		System.out.println("$ Generic 사용함으로써 형변환 할 필요 없다.");
		System.out.println("$ box3.setObj(\"hello\");");
		System.out.println("$ String str3 = box3.getObj();");
		System.out.println("$ box4.setObj(4);");
		System.out.println("$ int value4 = box4.getObj();");
		System.out.printf(">> str3(%s), value4(%d)\n\n", str3, value4);
	}
}
