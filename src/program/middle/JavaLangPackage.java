package program.middle;

public class JavaLangPackage {
	public static void main(String[] args) {
		
		System.out.println("\n$ [1] java.lang package");
		System.out.println("$ 따로 import 안해줘도 사용할 수 있는 package");
		System.out.println("$ wrapper, Object, String, StringBuffer, StringBuilder, System, Math 같은 것들을 포함하고 있음.");
		
		System.out.println("\n$ [2] Auto Boxing");
		System.out.println("$ 원래는 다음과 같이 기본형 type int를 객체 Integer로 변환해주어야 했다.");
		System.out.println("$ JAVA 5 Version 이후 JAVA Compiiler가 5를 자동으로 객체 Integer로 변환해준다.");
		System.out.println(">> Integer i2 = new Integer(5); --> Integer i3 = 5;");
		int i1 = 5;
		Integer i2 = new Integer(5);		
		Integer i3 = 5; 
		
		System.out.println("\n$ [3] Auto Unboxing");
		System.out.println("$ 원래는 다음과 같이 객체 Integer를 기본형 type int로 변환해주어야 했다.");
		System.out.println("$ JAVA 5 Version 이후 JAVA Compiiler가 i3을 자동으로 기본형 type int로 변환해준다.");
		System.out.println(">> int i4 = i3.intValue(); --> int i5 = i3;");
		int i4 = i3.intValue();
		int i5 = i3;
		
		System.out.println("\n$ [4] StringBuffer");
		System.out.println("$ .append() 하면 반환하는 값은 this, 곧 자기 자신이다.");
		System.out.println("$ chaining method를 이용해서 .append()를 계속 사용할 수 있다.");
		StringBuffer sb2 = new StringBuffer();
		StringBuffer sb3 = sb2.append("hello");
		if (sb2 == sb3) { System.out.println(">> StringBuffer sb3 = sb2.append(\"hello\"); --> sb2 == sb3"); }
		
		StringBuffer sb1 = new StringBuffer(); 
		sb1.append("hello"); sb1.append(" "); sb1.append("world"); 
		String str1 = sb1.toString();
		System.out.println(">> StringBuffer sb1 = new StringBuffer();");
		System.out.println(">> sb1.append(\"hello\"); sb1.append(\" \"); sb1.append(\"world\");");
		System.out.println(">> String str1 = sb1.toString();");
		
		String str2 = new StringBuffer().append("hello").append(" ").append("world").toString();
		System.out.println(">> String str2 = new StringBuffer().append(\"hello\").append(\" \").append(\"world\").toString();");
		System.out.println(">> str1.equals(str2) = " + str1.equals(str2));
		

		System.out.println("\n$ [5] 반복문 안에서 문자열 + 문자열 할 때마다 StringBuffer 객체 생성.");
		System.out.println("$ 새로운 객체 생성될 때마다 코드 실행시간이 더 길어짐.");
		System.out.println("$ StringBuffer 객체 생성 후, 반복문에서 .append() method를 사용하도록 하자.");
		
		long StartT1 = System.currentTimeMillis();
		String str4_1 = ""; for (int j=0; j<10000; j++) { str4_1 = str4_1 + "*"; }
		long EndT1 = System.currentTimeMillis(); 
		long DeltaT1 = EndT1 - StartT1;
		
		long StartT2 = System.currentTimeMillis();
		StringBuffer sb_4 = new StringBuffer(); for (int k=0; k<10000; k++) { sb_4.append("*"); } String str4_2 = sb_4.toString();
		long EndT2 = System.currentTimeMillis(); 
		long DeltaT2 = EndT2 - StartT2;
		
		if (DeltaT1 < DeltaT2) { 
			System.out.printf(">> 걸린 시간은 DeltaT1(%f ms) < DeltaT2(%f ms)\n", (double)DeltaT1, (double)DeltaT2);
		} else if (DeltaT1 > DeltaT2) { 
			System.out.printf(">> 걸린 시간은 DeltaT1(%f ms) > DeltaT2(%f ms)\n", (double)DeltaT1, (double)DeltaT2);
		} else { 
			System.out.printf(">> 걸린 시간은 DeltaT1(%f ms) = DeltaT2(%f ms)\n", (double)DeltaT1, (double)DeltaT2); 
		}

		System.out.println("\n$ [6] Math클래스는 이름 그대로 수학계산을 위한 클래스.");
		int value1 = Math.max(5, 20); System.out.printf(">> int value1 = Math.max(5, 20) = %d\n", value1);
		int value2 = Math.min(5, -5); System.out.printf(">> int value2 = Math.min(5, -5) = %d\n", value2);
		int value3 = Math.abs(-10); System.out.printf(">> int value3 = Math.abs(-10) = %d\n", value3);
		double value4 = Math.random(); System.out.printf(">> double value4 = Math.random() = %f\n", value4);
		double value5 = Math.sqrt(25); System.out.printf(">> double value5 = Math.sqrt(25) = %f\n", value5);
	}

}
