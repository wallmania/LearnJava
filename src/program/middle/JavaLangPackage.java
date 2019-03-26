package program.middle;

public class JavaLangPackage {
	public static void main(String[] args) {
		
		System.out.println("\n" + "$ java.lang package는 따로 import 안해줘도 사용할 수 있는 package 이다.");
		System.out.println("$ java.lang package에는 wrapper, Object, String, StringBuffer, StringBuilder, System, Math 같은 것들이 있다.");
		
		System.out.println("\n" + "$ Auto Boxing");
		System.out.println("$ 원래는 다음과 같이 기본형 type int를 객체 Integer로 변환해주어야 했다. --> Integer i2 = new Integer(5);");
		System.out.println("$ JAVA 5 Version 이후 JAVA Compiiler가 5를 자동으로 객체 Integer로 변환해준다. --> Integer i3 = 5;");
		int i = 5;
		Integer i2 = new Integer(5);		
		Integer i3 = 5; 
		
		System.out.println("\n" + "$ Auto Unboxing");
		System.out.println("$ 원래는 다음과 같이 객체 Integer를 기본형 type int로 변환해주어야 했다. --> int i4 = i3.intValue();");
		System.out.println("$ JAVA 5 Version 이후 JAVA Compiiler가 i3을 자동으로 기본형 type int로 변환해준다. --> int i5 = i3;");
		int i4 = i3.intValue();
		int i5 = i3;
		
		
		
		System.out.println("\n" + "----------------------------------------------------------------------------------------");
		System.out.println("$ StringBuffer");
		System.out.println("$ {내가 정의한 StringBuffer}.append() --> 반환하는 값은 this, 곧 자기 자신이다.");
		System.out.println("$ {내가 정의한 StringBuffer}.append() --> chaining method를 이용해서 .append()를 계속 사용할 수 있다.");
		
		StringBuffer sb1 = new StringBuffer();
		sb1.append("hello"); sb1.append(" "); sb1.append("world");
		String str1 = sb1.toString();
		System.out.println(">> " + str1 + " --> 출력 위해 3줄을 사용.");
		
		StringBuffer sb2 = new StringBuffer();
		StringBuffer sb3 = sb2.append("hello");
		if (sb2 == sb3) {
			System.out.println(">> sb2 == sb3");
		}
		String str2 = new StringBuffer().append("hello").append(" ").append("world").toString();
		System.out.println(">> " + str2 + " --> 출력 위해 1줄을 사용.");
		

		
		System.out.println("\n" + "----------------------------------------------------------------------------------------");
		System.out.println("$ String Class str3_1 생성 + String Class str3_2 생성 --> String Class str3_3 생성 및 str3_3 = str3_2 + str3_1");
		System.out.println("$ 문자열 + 문자열 --> StringBuffer 객체가 한 번 생성된다.");
		long timeStart_1 = System.currentTimeMillis();
		String str3_1 = "hello world";
		String str3_2 = str3_1.substring(5);
		String str3_3 = str3_1 + str3_2;
		long timeEnd_1 = System.currentTimeMillis();
		long Duration_1 = timeEnd_1 - timeStart_1;
		System.out.println(">> " + str3_1 + " + " + str3_2 + " = " + str3_3);
		
		System.out.println("");
		System.out.println("$ StringBuffer 객체 생성 + Chaing Method 통해 문자열 이어붙이기 + .toString() method를 통해 String 객체로 변환");
		System.out.println("$ 문자열 + 문자열 --> StringBuffer 객체가 한 번 생성된다.");
		long timeStart_2 = System.currentTimeMillis();
		String str3_4 = (new StringBuffer().append(str3_1).append(str3_2)).toString();
		long timeEnd_2 = System.currentTimeMillis();
		long Duration_2 = timeEnd_2 - timeStart_2;
		System.out.println(">> " + str3_1 + " + " + str3_2 + " = " + str3_4);
		
		System.out.println("");
		System.out.println("$ 반복문 안에서 문자열 + 문자열 하면 StringBuffer 객체 생성 --> 코드 실행시간이 더 오래걸림.");
		System.out.println("$ StringBuffer 객체 생성 후, 반복문에서 .append() method를 사용하도록 하자.");
		if (Duration_1 < Duration_2) { System.out.printf(">> [1번 반복] 걸린 시간은 Duration_1(%f ms) < Duration_2(%f ms)\n", (double)Duration_1, (double)Duration_2);
		} else if (Duration_1 > Duration_2) { System.out.printf(">> [1번 반복] 걸린 시간은 Duration_1(%f ms) > Duration_2(%f ms)\n", (double)Duration_1, (double)Duration_2);
		} else { System.out.printf(">> [1번 반복] 걸린 시간은 Duration_1(%f ms) = Duration_2(%f ms)\n", (double)Duration_1, (double)Duration_2); }
		
		long timeStart_3 = System.currentTimeMillis();
		String str4_1 = "";
		for (int j=0; j<10000; j++) { str4_1 = str4_1 + "*"; }
		long timeEnd_3 = System.currentTimeMillis(); long Duration_3 = timeEnd_3 - timeStart_3;
		
		long timeStart_4 = System.currentTimeMillis();
		StringBuffer sb_4 = new StringBuffer();
		for (int k=0; k<10000; k++) { sb_4.append("*"); }
		String str4_2 = sb_4.toString();
		long timeEnd_4 = System.currentTimeMillis(); long Duration_4 = timeEnd_4 - timeStart_4;
		
		if (Duration_3 < Duration_4) { System.out.printf(">> [10000번 반복] 걸린 시간은 Duration_3(%f ms) < Duration_4(%f ms)\n", (double)Duration_3, (double)Duration_4);
		} else if (Duration_3 > Duration_4) { System.out.printf(">> [10000번 반복] 걸린 시간은 Duration_3(%f ms) > Duration_4(%f ms)\n", (double)Duration_3, (double)Duration_4);
		} else { System.out.printf(">> [10000번 반복] 걸린 시간은 Duration_3(%f ms) = Duration_4(%f ms)\n", (double)Duration_3, (double)Duration_4); }

		
	}

}
